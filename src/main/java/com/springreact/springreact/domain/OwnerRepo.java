package com.springreact.springreact.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * @warning: this repo interface will require several fixes.
 * @author GIGA-Money
 * This is the owner repository interface.
 *
 */
public interface OwnerRepo extends CrudRepository<OwnerEntity, Long> {
   
  /**
   * Will return the list of cars by brand specified, relational DB.
   * 
   * @param brand
   * @return Parameters, the brand intended to be returned.
   */
  //List<OwnerEntity> findByBrand(String brand);

  /**
   * Will return a list of owners by color specified.
   * 
   * @param color
   * @return param, the intended color, to find the corresponding car.
   */
 // List<OwnerEntity> findByColor(String color);

  /**
   * input, the year of the owners to find.
   * 
   * @param year
   * @return Returns the list of cars.
   */
 // List<OwnerEntity> findByYear(int year);

  /**
   * Find by brand and model, returns list of owners, takes brand and model params.
   * 
   * @param brand
   * @param model
   * @return
   */
 // List<OwnerEntity> findByBrandAndModel(String brand, String model);

  /**
   * Find by brand or color, returns a list of owners, takes brand and color params.
   * 
   * @param brand
   * @param color
   * @return
   */
 // List<OwnerEntity> findByBrandOrColor(String brand, String color);

  /**
   * @QueryToMany(cascade = CascadeType.ALL, mappedby="owner") private List<CarEntity> carlist;
   */
}
