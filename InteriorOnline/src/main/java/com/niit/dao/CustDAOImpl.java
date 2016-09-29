package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Customer;
@Repository
@Transactional
public class CustDAOImpl implements CustDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Customer get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from cust").list();
	}

	@Override
	public boolean saveOrUpdate(Customer cust) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(cust);
		return true;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(id);
	}

}
