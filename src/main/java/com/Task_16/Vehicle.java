package com.Task_16;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Vehicle {
	@Id
	private int regno;
	private String brand;
	private String model;
	private int price;
	@ManyToOne
	private Emp employees;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public Vehicle(Emp employees) {
		super();
		this.employees = employees;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public Emp getEmployees() {
		return employees;
	}
	public void setEmployees(Emp employees) {
		this.employees = employees;
	}

	public Vehicle(int regno, String brand, String model, int price, Emp employees) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.employees = employees;
	}
	public Vehicle(int regno) {
		super();
		this.regno = regno;
	}
	public Vehicle() {
		super();
	}
	
	
}
