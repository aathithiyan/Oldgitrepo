package com.employeePortal.employeeportal.model;

public class Employee {
	public Employee(int id, String name, String address, String email, int phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	
	


	@Override
	public String toString() {
		return " employee{id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phonenumber="
				+ phonenumber + "}";
	}





	public Employee(String name) {
		super();
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	private int id;
	private String name;
	private String address;
	private String email;
	private int phonenumber;
	

}
 