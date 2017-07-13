package edu.learn.spring.spjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.learn.spring.spjdbc.DAO.CustomerDAO;
import edu.learn.spring.spjdbc.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext("Spring-Module.xml");

            CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
         
            
             Customer customer1 = new Customer("Ochu",6,53);
            customerDAO.insertCustomer(customer1);

//          List<Customer> customers = customerDAO.getAllcustomers();
//          customers.forEach(customer -> System.out.println(customer));
          
//         Customer customers = customerDAO.findByCustomerId(6);
//         System.out.println(customers);

           
/*         // updating customer data in customer table..
            Customer customer2 = new Customer();
            customer2.setCustId(6);
            customer2.setName("Sanka");
            customer2.setAge(40);
            customerDAO.updateCustomer(customer2);*/
            
            
          // customerDAO.deleteCustomer(6);
    }
}
