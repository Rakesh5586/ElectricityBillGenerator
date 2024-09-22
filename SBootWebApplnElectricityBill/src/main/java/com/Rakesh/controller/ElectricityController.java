package com.Rakesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Rakesh.model.Electricity;
import com.Rakesh.service.ElectricityServiceImp;

@Controller
public class ElectricityController 
{
	@Autowired
	public ElectricityServiceImp service;
	
	@RequestMapping("/")
    public String homePage()
    {
    	return "home";
    }
	@RequestMapping("/regisbillUrl")
    public String registerBill()
    {
    	return "regisbill";
    }
	@RequestMapping("/saveUrl")
    public String saveElectricityBill(Electricity electric, ModelMap model)
    {
		service.saveElectricBill(electric);
    	return "success";
    }
	@RequestMapping("/viewAllUrl")
	public String displayAllBill(ModelMap model)
	{
		model.put("bills",service.getAllElectricBill());
		return "viewbill";
	}
	@RequestMapping("/deleteUrl/{cid}")
	public String deleteElectricBill(@PathVariable int cid, ModelMap model)
	{
		service.deleteElectricBill(cid);
		return "redirect:/viewAllUrl";
	}
	@RequestMapping("/editUrl/{cid}")
	public String updateElectricBill(@PathVariable int cid, ModelMap model)
	{
		model.put("command",service.getOneElectricBill(cid));
		return "editbill";
	}
	@RequestMapping("/editsaveUrl")
	public String editSave(Electricity electric, ModelMap model)
	{
		service.updateStudent(electric);
		return "redirect:/viewAllUrl";
	}
}
