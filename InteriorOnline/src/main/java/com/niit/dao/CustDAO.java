package com.niit.dao;

import java.util.List;

import com.niit.model.Customer;

public interface CustDAO {
	public Customer get(String id);
    public List<Customer> list();
    public boolean saveOrUpdate(Customer cust);
    public void delete(String id);
}
