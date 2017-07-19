package edu.learn.spring.spjdbc.DAO;

import java.util.List;

import edu.learn.spring.spjdbc.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public Employee getById(int id);
	public List<Employee> getEmployees();
}
