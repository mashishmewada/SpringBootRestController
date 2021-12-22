package com.restcontroller.zbeans;

import java.util.List;

public class EmployeeResponse {
	
	private String error;

	private List<Emp> employeeList;
	
	private String status;
	
	private String errorCode;
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<Emp> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Emp> employeeList) {
		this.employeeList = employeeList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
