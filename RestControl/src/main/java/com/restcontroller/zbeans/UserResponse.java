package com.restcontroller.zbeans;

import java.util.List;

public class UserResponse {
	private String error;

	private String status;

	private String errorCode;

	private List<AdminUser> UserList;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<AdminUser> getUserList() {
		return UserList;
	}

	public void setUserList(List<AdminUser> userList) {
		UserList = userList;
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
