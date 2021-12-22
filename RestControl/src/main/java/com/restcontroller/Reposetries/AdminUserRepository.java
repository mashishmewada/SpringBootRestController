package com.restcontroller.Reposetries;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restcontroller.zbeans.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Integer> {
	
	public AdminUser findByEmailAndPassword(String eMail, String Password);

	public AdminUser findByUserName(String Name);

}
