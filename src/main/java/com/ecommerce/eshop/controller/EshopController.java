package com.ecommerce.eshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.eshop.model.Customer;
import com.ecommerce.eshop.rowMapper.CustomerRowMapper;

@RestController
public class EshopController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/customers")
	public List<Customer> customers() {
		List<Customer> customers = new ArrayList<Customer>();
		String sql = "select * from customer_details";
		customers=jdbcTemplate.query(sql, new CustomerRowMapper());
		return customers;
	}
}
