package edu.learn.spring.spjdbc.Daoimpl;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import edu.learn.spring.spjdbc.DAO.CustomerDAO;
import edu.learn.spring.spjdbc.model.Customer;

public class CustomerDaoimpl implements CustomerDAO{
	
	private SimpleJdbcInsert insertcustomer;

	@Override
	public void insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findByCustomerId(Integer custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllcustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer custId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Integer custId) {
		// TODO Auto-generated method stub
		
	}

}
