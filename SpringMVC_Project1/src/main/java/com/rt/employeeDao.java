package com.rt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class employeeDao {
	
	@Autowired
	JdbcTemplate template;
	
	public boolean register(Employee e) {
	
			try {
				
				
				
				Object[] args = { e.getFname(), e.getMname(), e.getSname(), e.getDob(), e.getMob(),e.getAddress(),e.getPincode(), e.getEmailId(),e.getPassword() };
				int a = template.update("insert into employee (`fname`,`mname`,`sname`,`dob`,`mob`,`address`,`pincode`,`emailId`,`password`) values(?,?,?,?,?,?,?,?,?)", args);
				
				System.out.println(a);
				
				if (a == 1) {
					 			 
							return true;
				} else {
							return false;
				}
				
			} catch (Exception e2) {

			}
			return false;

	}

//	************************************update**********************************
	
	public boolean update(Employee e) {
		
		try {
			 Object[] args = { e.getFname(), e.getMname(), e.getSname(), e.getDob(), e.getMob(), e.getAddress(), e.getPincode(), e.getEmailId(),e.getPassword(), e.getId()};
		        int a = template.update("UPDATE employee SET `fname` = ?, `mname` = ?, `sname` = ?, `dob` = ?, `mob` = ?, `address` = ?, `pincode` = ? , `emailId` = ? , `password` = ? WHERE id = ?",
		            args
		        );
		        
		        
		        if (a == 1) {
						
		        				return true;
				} else {
						
							return false;
				}
			
		} catch (Exception e2) {
		
		}
		return false;
	}
//*****************************************delete******************************************
	public Employee delete(int id) {
		
			
			try {

				Object[] args = { id };
				
				 int a = template.update("delete from employee where id = ?", args);
					System.out.println(a);

			} catch (Exception e2) {
				
			}
			return null;
			
		
	}
//******************************select******************************
	
	public  Employee select(int id) {
		
		Employee e = null;
		try {

			Object[] args = { id };
			 e = template.queryForObject("select * from employee", args, new RowMapper<Employee>() {

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
						rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
					
				
				}
			});

		} catch (Exception e2) {

		}
		return e;
};

//*************************************SelectAll***********************************************

public  List<Employee> selectAll() {
	
	List<Employee> list = null;
	
	try {

		 list = template.query("select * from employee", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Employee(rs.getInt(10),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}

			
		});

	} catch (Exception e2) {

	}
	return list;
};

}


	


	
	
	
	
	
