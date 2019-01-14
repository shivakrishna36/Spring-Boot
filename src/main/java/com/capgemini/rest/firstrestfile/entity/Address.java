package com.capgemini.rest.firstrestfile.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String flatNo;
	private String city;
	private String street;
	private int pincode;
	public String getFlatNo() {
		return flatNo;
	}
	
	public Address(){
		
	}
	
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	
	
}
