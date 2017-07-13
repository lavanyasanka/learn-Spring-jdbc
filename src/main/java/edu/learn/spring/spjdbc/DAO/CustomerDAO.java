package edu.learn.spring.spjdbc.DAO;

import java.util.List;

import edu.learn.spring.spjdbc.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer customer);
	public Customer findByCustomerId(Integer custId);
	public List<Customer> getAllcustomers();
	public void updateCustomer(Customer custId);
	public void deleteCustomer(Integer custId);

}
