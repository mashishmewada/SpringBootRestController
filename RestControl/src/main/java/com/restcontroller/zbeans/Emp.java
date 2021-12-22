package com.restcontroller.zbeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Emp  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id; 
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "experince")
	private String experince;
	@Column(name = "salary")
	private float salary; 
	@Column(name = "designation")
	private String designation;
	@Column(name ="joining_date")
	private String joining_date;
	@Column(name="Manage")
	private String Manage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		try {
			if(salary==null) {
				float salary1=0.0f;
				this.salary=salary1;
			}
			else {
			this.salary=salary;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getExperince() {
		return experince;
	}
	public void setExperince(String experince) {
		this.experince = experince;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getManage() {
		return Manage;
	}
	public void setManage(String manage) {
		Manage = manage;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
/*private String UserName;
private String Password;
private String Name;
private int id;
private float salary;
private String designation;

public String getName() {
	return Name;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public void setName(String name) {
	Name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public float getSalary() {
	return salary;
	
}

public void setSalary(Float salary) {
	try {
		if(salary==null) {
			float salary1=0.0f;
			this.salary=salary1;
		}
		else {
		this.salary=salary;
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}
public String toString() {
	return Name;
}*/
