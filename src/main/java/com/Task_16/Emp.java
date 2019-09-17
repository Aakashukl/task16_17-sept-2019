package com.Task_16;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int empId;
	private String empName;
	private int empSalary;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Laptop laptop;
	
	@OneToMany(mappedBy = "employees")
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	@ManyToMany
	private List<Project> projects=new ArrayList<Project>();

	public Emp(int empId, String empName, int empSalary, Laptop laptop) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.laptop = laptop;
	}
	
	

	public Emp() {
		super();
	}



	public Emp(int empId) {
		super();
		this.empId = empId;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}



	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", laptop=" + laptop + "]";
	}

	

	

}
