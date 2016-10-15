package com.niit.services.imple;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.custDao;
import com.niit.model.Customer;
import com.niit.services.custServices;

@Service
@Transactional
public class custServicesImple implements custServices {

	@Autowired
	private custDao custDAO;
	
	public void addCustomer(Customer customer) {
		
		custDAO.addCustomer(customer);
	}

	
	public void updateCustomer(Customer customer) {
		
		custDAO.updateCustomer(customer);
		
	}
	
	public void deleteCustomer(Customer customer) {
		
		custDAO.deleteCustomer(customer);
		
	}
	
	public List<Customer> viewCustomer(){
		
		return custDAO.viewCustomer();
	}
	}
	


