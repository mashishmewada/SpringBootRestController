package com.restcontroller.zbeans;

public class EmployeeRequest {
	
	//@Range(min=1, max=20,message="not in specified range")

	private String first_name;
	
	private String last_name;
	
	private String experience;
	
	private String joining_date;
	
	private String manager;
	
	private int id;
	
	private float salary;
	
	private String designation;
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		try {
			if(salary==null) {
				float salary1=0.0f;
				this.salary=salary1;
			}
			else {
			this.salary=salary;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
