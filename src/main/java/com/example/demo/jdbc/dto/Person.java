package com.example.demo.jdbc.dto;

public class Person 
{
	int id;
	String fname;
	String lname;
	String adress;
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Person(int id, String fname, String lname, String adress, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", adress=" + adress + ", city=" + city
				+ "]";
	}
	
}
