package com.Rakesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rakesh.model.Electricity;
import com.Rakesh.repo.ElectricityRepo;
@Service
public class ElectricityServiceImp implements ElectricityService 
{
	 @Autowired
      private ElectricityRepo repo;
	@Override
	public Electricity saveElectricBill(Electricity electric) 
	{
		int unit = 0;
		double service = 120.00;
		double totalbill=0.0;
		unit = electric.getCrd()-electric.getPrd();
		if(unit<300)
		{
			totalbill = 300*1.75;
		}
		else if(unit>=300 && unit<=500)
		{
			totalbill = (300*1.75)+(unit-300)*3.25;
		}
		else if(unit>=500)
		{
			totalbill = (300*1.75)+(200*3.25)+(unit-500)*7.25;
		}
		electric.setUnit(unit);
		electric.setTotal_bill(totalbill);
		electric.setService_charge(service);
		Electricity saveElectricBill = repo.save(electric);
		return saveElectricBill;
	}
	@Override
	public List<Electricity> getAllElectricBill() 
	{
		List<Electricity> listOfBill = (List<Electricity>) repo.findAll();
		return listOfBill;
	}

	@Override
	public void deleteElectricBill(int cid) 
	{
		repo.deleteById(cid);
	}
	@Override
	public Electricity getOneElectricBill(int cid) 
	{
		Electricity getbill  = repo.findById(cid).get();
		return getbill;
	}
	@Override
	public Electricity updateStudent(Electricity electric) 
	{
		int unit = 0;
		double service = 120.00;
		double totalbill=0.0;
		unit = electric.getCrd()-electric.getPrd();
		if(unit<300)
		{
			totalbill = 300*1.75;
		}
		else if(unit>=300 && unit<=500)
		{
			totalbill = (300*1.75)+(unit-300)*3.25;
		}
		else if(unit>=500)
		{
			totalbill = (300*1.75)+(200*3.25)+(unit-500)*7.25;
		}
		electric.setUnit(unit);
		electric.setTotal_bill(totalbill);
		electric.setService_charge(service);
		Electricity saveElectricBills = repo.save(electric);
		return saveElectricBills;
	}

}
