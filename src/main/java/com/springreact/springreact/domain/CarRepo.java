package com.springreact.springreact.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


/**
 * 
 * @author GIGA-Money The carRepo extends the spring JAP CRUD repository interface. types car entity
 *         and long.
 *
 */
public interface CarRepo extends CrudRepository<CarEntity, Long> {
  /**
   * Will return the list of cars by brand specified, relational DB.
   * 
   * @param brand
   * @return Parameters, the brand intended to be returned.
   */
  List<CarEntity> findByBrand(String brand);

  /**
   * Will return a list of cars by color specified.
   * 
   * @param color
   * @return param, the intended color, to find the corresponding car.
   */
  List<CarEntity> findByColor(String color);

  /**
   * input, the year of the cars to find.
   * 
   * @param year
   * @return Returns the list of cars.
   */
  List<CarEntity> findByYear(int year);
  
  /**
   * Find by brand and model, returns list of cars, takes brand and model params.
   * @param brand
   * @param model
   * @return
   */
  List<CarEntity> findByBrandAndModel(String brand, String model);
  
  /**
   * Find by brand or color, returns a list of cars, takes brand and color params.
   * @param brand
   * @param color
   * @return
   */
  List<CarEntity> findByBrandOrColor(String brand,  String color);
  
}
