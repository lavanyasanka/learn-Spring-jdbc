package edu.learn.spring.spjdbc.model;


public class Customer {
	
	private Integer custId;
	private String name;
	private Integer  age;
	

	//getter and setter methods
	
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	//constructors
	public Customer(Integer custId) {
		super();
		this.custId = custId;
	}
	public Customer() {
		super();
	}
	
	
	
	public Customer( String name,Integer custId, Integer age) {
		super();
		this.name = name;
		this.custId = custId;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", age=" + age + "]";
	}
	

}
