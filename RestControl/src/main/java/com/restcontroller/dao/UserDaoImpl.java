package com.restcontroller.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.restcontroller.Reposetries.AdminUserRepository;
import com.restcontroller.zbeans.AdminUser;



@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	AdminUserRepository userep;
	
	@PersistenceContext
	EntityManager entityManager;
	
	public AdminUser save(AdminUser emp){
		
		return userep.save(emp);
	}
	public List<AdminUser> findAll(){
		return userep.findAll();
	}
	public AdminUser savee(AdminUser userentity) {
		// TODO Auto-generated method stub
		String eMail=userentity.getEmail();
		String Password=userentity.getPassword();
		return userep.findByEmailAndPassword(eMail, Password);
	}
	
	public AdminUser CheckUserName(AdminUser userentity){
		String name = userentity.getEmail();
		return userep.findByUserName(name);
	}
}
