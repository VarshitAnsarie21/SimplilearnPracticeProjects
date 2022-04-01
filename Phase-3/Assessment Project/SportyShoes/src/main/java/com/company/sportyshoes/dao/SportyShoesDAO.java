package com.company.sportyshoes.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.company.sportyshoes.entity.*;

@Repository
public class SportyShoesDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> getUserDetails(int id) {
		

		List<User> userDetails = jdbcTemplate.query("select * from users", new RowMapper<User> () {
		
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUsername(rs.getString(1));
				user.setUseremail(rs.getString(2));
				
				return user;
			}
			
		});
		
		return userDetails;
	}
	
	
	public boolean getAdmin(String adminemail, String adminpassword) {
		
		boolean isSuccess;

		@SuppressWarnings("deprecation")
		Admin adminCredential = jdbcTemplate.queryForObject("select * from admin where adminemail=? AND adminpassword=?", new Object[] {adminemail, adminpassword} , new RowMapper<Admin> () {
			
			@Override
			public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
				Admin admin = new Admin();
				admin.setAdminemail(rs.getString(1));
       			admin.setAdminpassword(rs.getString(2));
				
				return admin;
			}	
		});
		
		if(adminCredential != null) {
			
			isSuccess = true;
			
		}else {
			
			isSuccess = false;
			
		}
		
		return isSuccess;
	}
	
	public void changeAdminPassword(String adminpassword) {
		
		jdbcTemplate.update("update admin set adminpassword=? where adminid=1", new Object[] { adminpassword });
		
	}
	
	public List<User> getUsers() {
		
		List<User> users = jdbcTemplate.query("select * from users", new RowMapper<User> () {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				
				user.setUsername(rs.getString(1));
				user.setUseremail(rs.getString(2));
				
				return user;
			}
			
		});
		
		return users;
	}
	
	public User getUserByName(String username) {
		
		@SuppressWarnings("deprecation")
		User userDetails = jdbcTemplate.queryForObject("select * from users where username=?", new Object[] {username} , new RowMapper<User> () {
			
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				
				user.setUsername(rs.getString(2));
				user.setUseremail(rs.getString(3));
				
				return user;
			}
			
		});
		
		return userDetails;
	}
		
}
