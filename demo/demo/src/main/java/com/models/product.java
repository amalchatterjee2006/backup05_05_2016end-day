package com.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product 
{
	@Id
	private int id;
	private String name;
	private String country;
	public int getId() {
		return id;
	}
	
	public product(int a,String b,String c)
	{
		
		id=a;
		name=b;
		country=c;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
