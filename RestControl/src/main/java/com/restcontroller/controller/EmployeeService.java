package com.restcontroller.controller;

import com.restcontroller.zbeans.EmployeeRequest;
import com.restcontroller.zbeans.EmployeeResponse;

public interface EmployeeService {

	public EmployeeResponse getEmployee();
	
	public EmployeeResponse save(EmployeeRequest employeeReq);
	
	public EmployeeResponse update(EmployeeRequest employeeReq);

	public EmployeeRequest getEmployeeById(EmployeeRequest employeeReq);
	
	public EmployeeRequest getEmployeeByIdToDelete(EmployeeRequest employeeReq);

}
