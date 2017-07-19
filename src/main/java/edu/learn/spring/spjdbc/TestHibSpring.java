package edu.learn.spring.spjdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import edu.learn.spring.spjdbc.Daoimpl.EmployeeDaoimpl;
import edu.learn.spring.spjdbc.model.Employee;

public class TestHibSpring {
public static void main(String[] args) {
	
	Resource res=new ClassPathResource("Spring-Module.xml");  
	
    @SuppressWarnings("deprecation")
	BeanFactory factory=new XmlBeanFactory(res);  
      
    EmployeeDaoimpl dao=( EmployeeDaoimpl)factory.getBean("emp");  
      
    Employee e=new Employee();  
  //  e.setId(114);  
    e.setName("varun");  
    e.setSalary(50000);  
      
    dao.saveEmployee(e);  
  //  System.out.println(e);
}
}
