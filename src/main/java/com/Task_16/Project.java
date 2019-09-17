package com.Task_16;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private String projectCode;
	private String projectName;
	
	@ManyToMany(mappedBy="projects")
	List<Emp> employees=new ArrayList<Emp>();

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}

	public Project(String projectCode, String projectName) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;

	}

	public Project(String projectCode) {
		super();
		this.projectCode = projectCode;
	}

	public Project() {
		super();
	}
	
	
}
