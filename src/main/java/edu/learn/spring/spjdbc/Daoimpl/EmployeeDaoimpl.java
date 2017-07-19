package edu.learn.spring.spjdbc.Daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import edu.learn.spring.spjdbc.DAO.EmployeeDao;
import edu.learn.spring.spjdbc.model.Employee;

public class EmployeeDaoimpl implements EmployeeDao {

	
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	@Override
	public void saveEmployee(Employee e) {
		System.out.println("inside save....");
	    template.save(e);  
	    System.out.println(e);
		
	}

	@Override
	public void updateEmployee(Employee e) {
		 template.update(e);  
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		   template.delete(e);  
		
	}

	@Override
	public Employee getById(int id) {
		  Employee e=(Employee)template.get(Employee.class,id);  
		    return e;
	}

	@Override
	public List<Employee> getEmployees() {
	    List<Employee> list=new ArrayList<Employee>();  
	    list=template.loadAll(Employee.class);  
	    return list; 
	}

}
