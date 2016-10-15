package com.niit.dao;

import java.util.List;

import com.niit.model.Customer;

public interface custDao {

	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public List<Customer> viewCustomer();
}
