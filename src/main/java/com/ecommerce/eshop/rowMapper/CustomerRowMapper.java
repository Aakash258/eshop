package com.ecommerce.eshop.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.eshop.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

	 @Override
     public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
         Customer customer = new Customer();
         customer.setCustomer_id(resultSet.getInt("customer_id"));
         customer.setFirst_name(resultSet.getString("first_name"));
         customer.setLast_name(resultSet.getString("last_name"));
         customer.setAddress(resultSet.getString("address"));
         customer.setCity(resultSet.getString("city"));
         customer.setEmail(resultSet.getString("email"));
         customer.setGender(resultSet.getString("gender"));
         customer.setCustomer_photo(resultSet.getString("customer_photo"));
         customer.setPincode(resultSet.getInt("pincode"));
         customer.setPhone(resultSet.getInt("phone"));
         customer.setState(resultSet.getString("state"));
         return customer;
     }
}
