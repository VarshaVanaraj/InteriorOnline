package com.niit.service;
import java.util.List;

import com.niit.model.Customer;

public interface CustDAOService {
	public Customer get(String id);
    public List<Customer> list();
    public boolean saveOrUpdate(Customer cust);
    public void delete(String id);
}
