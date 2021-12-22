package com.restcontroller.controller;

import com.restcontroller.zbeans.UserRequest;
import com.restcontroller.zbeans.UserResponse;

public interface UserService {
	public UserResponse save(UserRequest userentity);

	public UserResponse findAll();
	
	public UserResponse findByEmailAndPassword(UserRequest userrequest);
	
	public UserResponse CheckUserName(UserRequest userrequest);

}
