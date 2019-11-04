package com.springreact.springreact.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springreact.springreact.domain.CarEntity;
import com.springreact.springreact.domain.CarRepo;

@RestController
public class CarController {
  
    @Autowired private CarRepo localRepo;
    
    @GetMapping("/cars") 
    public Iterable<CarEntity> getCars() 
    { return localRepo.findAll(); }
   
}
