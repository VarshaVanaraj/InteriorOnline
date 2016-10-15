package com.niit.services;

import java.util.List;

import com.niit.model.Customer;

public interface custServices {

	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public List<Customer> viewCustomer();
}
