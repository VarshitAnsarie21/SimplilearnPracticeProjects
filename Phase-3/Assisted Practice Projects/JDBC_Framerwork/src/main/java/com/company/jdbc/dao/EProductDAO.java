package com.company.jdbc.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.company.jdbc.entity.EProduct;

@Repository
public class EProductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<EProduct> getProducts() {
		
		List<EProduct> eproducts = jdbcTemplate.query("select * from eproduct", new RowMapper<EProduct> () {
			
			@Override
			public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				EProduct eproduct = new EProduct();
				eproduct.setID(rs.getInt(1));
				eproduct.setName(rs.getString(2));
				eproduct.setPrice(rs.getInt(3));
				eproduct.setDateAdded(rs.getDate(4));
				
				return eproduct;
			}
			
		});
		
		return eproducts;
	}
}
