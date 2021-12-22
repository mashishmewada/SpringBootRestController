package com.restcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restcontroller.zbeans.UserRequest;
import com.restcontroller.zbeans.UserResponse;

@RestController
@Validated
@RequestMapping(value = "/userRestController", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserRestController {

	@Autowired
	UserService userservice;

	@GetMapping(value = "/useremp")
	public UserResponse viewuser() {
		UserResponse response = new UserResponse();
		try {
			response = userservice.findAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@PostMapping(value = "/submit")
	public UserResponse signup(@RequestBody UserRequest userrequest) {

		UserResponse response = new UserResponse();
		if (userrequest.getUserName().equals("")) {
			response.setErrorCode("01");
			response.setError("name is required");
			return response;
		} else if (userrequest.getEmail().equals("")) {
			response.setErrorCode("01");
			response.setError("name is required");
			return response;
		} else if (userrequest.getPassword().equals("")) {
			response.setErrorCode("01");
			response.setError("name is required");
			return response;
		} else {
			response = userservice.save(userrequest);
			return response;
		}
	}

}
