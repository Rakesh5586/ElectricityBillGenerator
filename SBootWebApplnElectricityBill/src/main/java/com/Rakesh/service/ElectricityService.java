package com.Rakesh.service;

import java.util.List;

import com.Rakesh.model.Electricity;

public interface ElectricityService 
{
  public Electricity saveElectricBill(Electricity electric);
  public Electricity getOneElectricBill(int cid);
  public void deleteElectricBill(int cid);
  public List<Electricity> getAllElectricBill();
  public Electricity updateStudent(Electricity electric);
}
