package com.restcontroller.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restcontroller.zbeans.EmployeeRequest;
import com.restcontroller.zbeans.EmployeeResponse;
@RestController
@Validated
@RequestMapping(value = "/empRestController", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class EmpRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	
    @GetMapping(value="/viewemp")    
    public EmployeeResponse viewem(){
    	EmployeeResponse response = new EmployeeResponse();
    	try {
    		response = employeeService.getEmployee(); 
        
    	} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
    }
    @PostMapping(value="/submit")    
    public EmployeeResponse signup(@RequestBody EmployeeRequest employeeReq,BindingResult binding){
    	EmployeeResponse response = new EmployeeResponse();
    	/*if(binding.hasErrors()) {
    		List<ObjectError> ne=binding.getAllErrors();
    		response.setError(ne.getDefaultMessage);
    	}*/
    	
    	
    
    	
    	if(employeeReq.getFirst_name().equals("")) {
    		response.setErrorCode("01");
    		response.setError("name is required");
    		return response;
    	}
    	else if (employeeReq.getSalary()==0) {
    		response.setErrorCode("02");
    		response.setError("salary should be greater than 1");
    		return response;
    	}
    	else if(employeeReq.getDesignation().equals("")) {
    		response.setErrorCode("03");
    		response.setError("designation cannot be null");
            return response;
    	}
    	else {
    		response=employeeService.save(employeeReq);
    		return response;
    	}
    } 
    @PostMapping(value="/editemp")    
    public EmployeeRequest editEmpolyee(@RequestBody EmployeeRequest employeeReq){ 
    	EmployeeRequest response = new EmployeeRequest();
    	response=employeeService.getEmployeeById(employeeReq);
    	return response; 	
    }  
    @PostMapping(value="/update")    
    public EmployeeResponse update(@RequestBody EmployeeRequest employeeReq){ 
    	EmployeeResponse response = new EmployeeResponse();
    	response=employeeService.update(employeeReq);
    	return response;
    }
    @PostMapping(value="/delete")
    public EmployeeResponse delete(@RequestBody EmployeeRequest employeeReq) {
    	employeeService.getEmployeeByIdToDelete(employeeReq);
    	return null;
    }
    
}
