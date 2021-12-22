package com.restcontroller.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restcontroller.dao.EmployeeDao;
import com.restcontroller.zbeans.Emp;
import com.restcontroller.zbeans.EmployeeRequest;
import com.restcontroller.zbeans.EmployeeResponse;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public EmployeeResponse getEmployee() {
		EmployeeResponse empRes = new EmployeeResponse();
		try {

			List<Emp> list = employeeDao.findAll();
			if (!list.isEmpty()) {
				empRes.setEmployeeList(list);
				empRes.setStatus("success");
				empRes.setErrorCode("00");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return empRes;
	}

	public EmployeeResponse save(EmployeeRequest employeeReq) {
		Emp emp = new Emp();
		EmployeeResponse empRes = new EmployeeResponse();
		try {

			BeanUtils.copyProperties(employeeReq, emp);

			Emp emp2 = employeeDao.save(emp);
			if (emp2 != null) {
				empRes.setStatus("success");
				empRes.setErrorCode("00");
			} else {
				empRes.setStatus("failure");
				empRes.setErrorCode("000");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empRes;

	}
	public EmployeeResponse update(EmployeeRequest employeeReq) {
		Emp emp = new Emp();
		BeanUtils.copyProperties(employeeReq, emp);
		Emp emp2 = employeeDao.save(emp);
		EmployeeResponse empRes = new EmployeeResponse();
		if(emp2!=null) {
		empRes.setStatus("sucess");
		}
		else {
			empRes.setStatus("null");
		}
		return empRes;
	}

	
	public EmployeeRequest getEmployeeById(EmployeeRequest employeeReq) {
		EmployeeRequest employeeRequest = new EmployeeRequest();
		Emp emp = employeeDao.getEmployeeById(employeeReq.getId());
		BeanUtils.copyProperties(emp, employeeRequest);
		return employeeRequest;
	}
	public EmployeeRequest getEmployeeByIdToDelete(EmployeeRequest employeeReq)
	{
		EmployeeResponse empRes = new EmployeeResponse();
		int id =employeeReq.getId();
		employeeDao.delete(id);
		empRes.setStatus("Sucess");
		return null;
	}

}
