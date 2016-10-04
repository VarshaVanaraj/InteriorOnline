package com.niit.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustDAO;
import com.niit.model.Customer;

@Service
@Transactional
public class CustDAOServiceImpl implements CustDAOService{
	@Autowired
	CustDAO custDao;

	public void addCust(Customer cust) {
		// TODO Auto-generated method stub
		custDao.addCust(cust);
	}

	public List<Customer> list() {
		// TODO Auto-generated method stub
		return custDao.list();
	}

	public void saveOrUpdate(Customer cust) {
		// TODO Auto-generated method stub
		custDao.saveOrUpdate(cust);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		custDao.delete(id);
	}

}
