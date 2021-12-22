package com.restcontroller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restcontroller.Reposetries.EmployeeRepository;
import com.restcontroller.zbeans.Emp;



@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	EmployeeRepository empresp;
	public List<Emp> findAll(){
		/*JPAQuery<Tuple> query = new JPAQuery<Tuple>(entityManager);
		QEmp employee = QEmp.emp;
		List<Emp> findall= query.from(employee).select(employee)
		.orderBy(employee.id.asc()).fetch();
		return findall;*/
		return empresp.findAll();
	}
	public Emp save(Emp emp){
		return empresp.save(emp);
	}
	public Emp getEmployeeById(int id){
		return empresp.findById(id);
	}
	public Emp update(Emp emp) {
		return empresp.save(emp);
	}
	public void delete(int id) {
		 empresp.deleteById(id);
	}
	
}

		
	    /*String sql="select * from emp limit "+(pageid-1)+","+total1;    
	    return template.query(sql,new RowMapper<Emp>(){    
	        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
	            Emp e=new Emp();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getFloat(3));    
	            return e;    
	        }    
	    }); */   
	

	
	/*@Autowired
	public List<Emp> getEmployeesByPage(int pageid,int total1){  
		
		JPAQuery<Tuple> query = new JPAQuery<Tuple>(entityManager);
		QEmp employee = QEmp.emp;
		List<Emp> findall= query.from(employee).select(employee).offset(pageid).limit(total1)
		.orderBy(employee.id.asc()).fetch();
		return findall;
		
		
	    String sql="select * from emp limit "+(pageid-1)+","+total1;    
	    return template.query(sql,new RowMapper<Emp>(){    
	        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
	            Emp e=new Emp();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getFloat(3));    
	            return e;    
	        }    
	    });    
	
	}
}*/
	
	
	
	/*JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int create(Emp p) {
		String sql = "insert into Emp98(Name,UserName,Password) values('" + p.getName() + "'," + p.getUserName() + ",'"
				+ p.getPassword() + "')";
		return template.update(sql);
	}

	public int save(Emp p) {
		String sql = "insert into Emp99(name,salary,designation) values('" + p.getName() + "'," + p.getSalary() + ",'"
				+ p.getDesignation() + "')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update Emp99 set name='" + p.getName() + "', salary=" + p.getSalary() + ",designation='"
				+ p.getDesignation() + "' where id=" + p.getId() + "";
		return template.update(sql);
	}
	

	public int delete(int id) {
		String sql = "delete from Emp99 where id=" + id + "";
		return template.update(sql);
	}
	@SuppressWarnings("unchecked")
	public Emp getEmpById(int id) {
		try {
			String sql = "select * from Emp99 where id= ?";
			return template.queryForObject(sql, new Object[] { id }, new EmpRowMapper());

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public Emp findById(int id) {

		String sql = "SELECT * FROM Emp99 WHERE ID = ?";

		return template.queryForObject(sql, new Object[] { id }, Emp.class);

	}
	public List<Emp> getSingleEmp(String p)
	{
		return template.query("select * from Emp99 where name='"+p+"'", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
	
	public List<Emp> getEmployees() {
		return template.query("select * from Emp99", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}*/

