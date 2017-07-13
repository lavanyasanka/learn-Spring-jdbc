package edu.learn.spring.spjdbc.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.learn.spring.spjdbc.DAO.CustomerDAO;
import edu.learn.spring.spjdbc.model.Customer;
import edu.learn.spring.spjdbc.model.CustomerMapper;

public class CoustomerDaoimpl implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	//getter and setter for jdbc template
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	private JdbcTemplate getJdbcTemplate() {
		return null;
	}

	@Override
	public void insertCustomer(Customer customer) {
		String sql =" insert into customer values('"+customer.getName()+"','"+customer.getCustId()+"','"+customer.getAge()+"')";  
		jdbcTemplate.update(sql);  	
	}

	@Override
	public Customer findByCustomerId(Integer custId) {
		String sql = "select * from Customer WHERE cust_Id = ?";
		Customer customer = jdbcTemplate.queryForObject(sql, new Object[]{custId}, new CustomerMapper());
		return customer;
	}


	@Override
	public List<Customer> getAllcustomers() {

		String sql = "SELECT * FROM CUSTOMER";

		List<Customer> customers  = jdbcTemplate.query(sql,  new CustomerMapper());

		return customers;
	}

	@Override
	public void updateCustomer(Customer customer) {

		String sql =  "update customer set name=?,age=? where cust_Id =?";  
		//jdbcTemplate.update(sql, new Object[] { customer.getName(),Integer.valueOf(customer.getAge()), Integer.valueOf(customer.getCustId())});
		jdbcTemplate.update(sql, new Object[] {customer.getName(),Integer.valueOf(customer.getAge()), Integer.valueOf(customer.getCustId())});
	}
	@Override
	public void deleteCustomer(Integer custId) {
		String sql = "delete from customer where cust_Id =?";
		jdbcTemplate.update(sql, custId );  

	}

}
