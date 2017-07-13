package edu.learn.spring.spjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int row) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(rs.getInt("cust_Id"));
		customer.setName(rs.getString("name"));
		customer.setAge(rs.getInt("age"));

		return customer;
	}
}

