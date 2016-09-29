package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CustDAO;
import com.niit.model.Customer;

@Service
public class CustDAOServiceImpl implements CustDAOService{
	@Autowired
	CustDAO custDao;

	@Override
	public Customer get(String id) {
		// TODO Auto-generated method stub
		return custDao.get(id);
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return custDao.list();
	}

	@Override
	public boolean saveOrUpdate(Customer cust) {
		// TODO Auto-generated method stub
		return custDao.saveOrUpdate(cust);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		custDao.delete(id);
	}

}
