package com.ltts.Rental.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Rental.model.Car;

public interface CarRepo extends JpaRepository<Car,Integer>{

}
