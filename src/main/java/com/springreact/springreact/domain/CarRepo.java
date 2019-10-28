package com.springreact.springreact.domain;

import org.springframework.data.repository.CrudRepository;


/**
 * 
 * @author GIGA-Money
 * The carRepo extends the spring JAP crud repositiry interface.
 * types car entity and long. 
 *
 */
public interface CarRepo extends CrudRepository<CarEntity, Long>{

}
