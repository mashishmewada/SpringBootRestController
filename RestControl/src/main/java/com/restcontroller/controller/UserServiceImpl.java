package com.restcontroller.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restcontroller.dao.UserDao;
import com.restcontroller.zbeans.AdminUser;
import com.restcontroller.zbeans.UserRequest;
import com.restcontroller.zbeans.UserResponse;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao UserDao;

	public UserResponse save(UserRequest userrequest) {
		AdminUser userentity = new AdminUser();
		UserResponse userRes = new UserResponse();
		try {
			BeanUtils.copyProperties(userrequest, userentity);
			AdminUser user = UserDao.save(userentity);
			if (user != null) {
				userRes.setStatus("success");
			} else {
				userRes.setErrorCode("045");
				userRes.setStatus("failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRes;
	}

	public UserResponse findAll() {
		UserResponse userRes = new UserResponse();
		try {

			List<AdminUser> list = UserDao.findAll();
			if (!list.isEmpty()) {
				userRes.setUserList(list);
				userRes.setStatus("success");
				userRes.setErrorCode("00");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRes;
	}

	public UserResponse findByEmailAndPassword(UserRequest userrequest) {
		UserResponse userRes = new UserResponse();
		AdminUser userentity = new AdminUser();
		BeanUtils.copyProperties(userrequest, userentity);
		try {
			AdminUser userentity1 = UserDao.savee(userentity);
			if (userentity1 != null) {
				userRes.setStatus("success");
			} else {
				userRes.setError("046");
				userRes.setStatus("failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRes;
	}

	public UserResponse CheckUserName(UserRequest userrequest) {
		UserResponse userRes = new UserResponse();
		AdminUser userentity = new AdminUser();
		userentity.setEmail(userrequest.getEmail());
		AdminUser userentity2 = UserDao.CheckUserName(userentity);
		try {
			if (userentity2 != null) {
				userRes.setStatus("success");
			} else {
				userRes.setError("046");
				userRes.setStatus("failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRes;
	}

}
