package com.jdbc.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.app.model.Customer;

@Repository
public class SpringJdbcDao {
	
	
	   @Autowired
	     private JdbcTemplate jdbcTemplate;
	/*
	 * public String index(){ jdbcTemplate.
	 * execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')"
	 * ); return"data inserted Successfully"; }
	 */

	     private static final String SQL = "select * from customers";

	     public List<Customer> isData() {

	          List<Customer> customers = new ArrayList<Customer>();
	          List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

	          for (Map<String, Object> row : rows) 
	          {
	               Customer customer = new Customer();
			/*
			 * customer.setCustNo(10001); customer.setCustName("Ranga");
			 * customer.setCountry("india"); customer.getCustNo(); customer.getCustName();
			 * customer.getCountry(); */
	               
	             customer.setCustNo((String)row.get("custNo"));
	              customer.setCustName((String)row.get("custName"));
	               customer.setCountry((String)row.get("country"));
customers.add(customer);
			 
	           }

	         return customers;
	     }
}
