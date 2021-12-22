package com.restcontroller.Reposetries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restcontroller.zbeans.Emp;

public interface EmployeeRepository extends JpaRepository<Emp, Integer> {
	
	public Emp findById(int id);
}
