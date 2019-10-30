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
   * This is a local repo for cars, used for testing the h2 db.
   */
  @Autowired
  private CarRepo localRepo;
  private CarEntity localCar = new CarEntity("Toy", "Cam", "Green", "802-11", 97, 100000);
  private CarEntity localCar2 = new CarEntity("Toy", "Col", "Gray", "801-10", 96, 102500);

  @Bean
	CommandLineRunner runing() {
	  return args -> 	  {
	    localRepo.save(localCar);
	    localRepo.save(localCar2);
	  };
	}

}
