package com.niit.dao;

import java.util.List;

import com.niit.model.Customer;

public interface CustDAO {
	public void addCust(Customer cust);
    public List<Customer> list();
    public void saveOrUpdate(Customer cust);
    public void delete(String id);
}
