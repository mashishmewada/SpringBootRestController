package com.restcontroller.dao;

import java.util.List;

import com.restcontroller.zbeans.AdminUser;



public interface UserDao {
	public AdminUser save(AdminUser emp);
	
	public List<AdminUser> findAll();
	
	
	
	public AdminUser savee(AdminUser emp);
	
	public AdminUser CheckUserName(AdminUser userentity);
	
	
	
}

