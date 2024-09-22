package com.Rakesh.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electricity 
{ @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int cid;
  private String cname;
  private int crd;
  private int prd;
  private int unit;
  private double service_charge;
  private double total_bill;

public Electricity() {
	super();
}

public Electricity(int cid, String cname, int crd, int prd, int unit, double service_charge, double total_bill) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.crd = crd;
	this.prd = prd;
	this.unit = unit;
	this.service_charge = service_charge;
	this.total_bill = total_bill;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public int getCrd() {
	return crd;
}

public void setCrd(int crd) {
	this.crd = crd;
}

public int getPrd() {
	return prd;
}

public void setPrd(int prd) {
	this.prd = prd;
}

public int getUnit() {
	return unit;
}

public void setUnit(int unit) {
	this.unit = unit;
}

public double getService_charge() {
	return service_charge;
}

public void setService_charge(double service_charge) {
	this.service_charge = service_charge;
}

public double getTotal_bill() {
	return total_bill;
}

public void setTotal_bill(double total_bill) {
	this.total_bill = total_bill;
}

@Override
public String toString() {
	return "Electricity [cid=" + cid + ", cname=" + cname + ", crd=" + crd + ", prd=" + prd + ", unit=" + unit
			+ ", service_charge=" + service_charge + ", total_bill=" + total_bill + "]";
}
}
