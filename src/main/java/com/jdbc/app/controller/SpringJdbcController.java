package com.jdbc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.app.model.Customer;
import com.jdbc.app.repository.SpringJdbcDao;

@RestController
public class SpringJdbcController {
	
	
@Autowired
public SpringJdbcDao dao;


@RequestMapping("/getcustInfo")
public List<Customer> customerInformation(){
	 List<Customer> customers = dao.isData();
	return customers;
	
}
}
