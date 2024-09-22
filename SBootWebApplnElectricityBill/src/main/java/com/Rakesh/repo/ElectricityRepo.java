package com.Rakesh.repo;

import org.springframework.data.repository.CrudRepository;

import com.Rakesh.model.Electricity;

public interface ElectricityRepo extends CrudRepository<Electricity, Integer> 
{

}
