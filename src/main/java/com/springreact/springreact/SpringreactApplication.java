package com.springreact.springreact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * cmd runner for h2 db testing.
 */
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.springreact.springreact.domain.CarEntity;
import com.springreact.springreact.domain.CarRepo;
import com.springreact.springreact.domain.OwnerEntity;
import com.springreact.springreact.domain.OwnerRepo;

@SpringBootApplication
/**
 * 
 * @author GIGA-Money This is the main for the application. When using the h2 db for local mem
 *         testing: jdbc:h2:mem:testdb .
 */
public class SpringreactApplication {

  /**
   * This is a simple logger facade for java, just to push logs to the console.
   */
  private static final Logger logger = LoggerFactory.getLogger(SpringreactApplication.class);

  /**
   * 
   * @param args This is the main.
   */
  public static void main(String[] args) {
    SpringApplication.run(SpringreactApplication.class, args);
    logger.info("anything goes");
  }

  /**
   * These are local owners used for testing the h2 db.
   */
  @Autowired
  private OwnerRepo localOwnerRepo;
  private OwnerEntity owner = new OwnerEntity("Cave", "Johnson");
  private OwnerEntity owner2 = new OwnerEntity("Jan", "Leafin");

  /**
   * This is a local repo for cars, used for testing the h2 db.
   */
  @Autowired
  private CarRepo localCarRepo;
  private CarEntity localCar = new CarEntity("Toy", "Cam", "Green", "802-11", 97, 100000, owner);
  private CarEntity localCar2 = new CarEntity("Toy", "Col", "Gray", "801-10", 96, 102500, owner2);
  private CarEntity localCar3 = new CarEntity("For", "Tar", "Tan", "568-98-11", 2009, 90500);
  private CarEntity localCar4 = new CarEntity("Chev", "Chall", "Black", "124-66-30", 11, 78601);

  /**
   * Order of operation note: owners must be saved before cars, as cars are depended on the owner
   * for fetching details, and ower's cascade not fetch. so when there are entities that fetch they
   * need to save AFTER the cascading repo, or they will fail to fetch.
   * 
   * @return
   */
  @Bean
  CommandLineRunner runing() {
    return args -> {
      localOwnerRepo.save(owner);
      localOwnerRepo.save(owner2);
      localCarRepo.deleteAll();
      localCarRepo.save(localCar);
      localCarRepo.save(localCar2);
      localCarRepo.save(localCar3);
      localCarRepo.save(localCar4);
    };
  }

}
