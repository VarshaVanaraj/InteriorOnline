package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.niit.model.Customer;
@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
public class CustDAOImpl implements CustDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	
	public CustDAOImpl(SessionFactory sessionFactory) 
	{
	this.sessionFactory = sessionFactory;
	}
	
	
	Session session=sessionFactory.openSession();
	Transaction transaction =(Transaction) session.beginTransaction();
	
	@Override
	public void addCust(Customer cust) {
		// TODO Auto-generated method stub
		session.save(cust);
		transaction.commit();
	}

	@SuppressWarnings("unchecked" )
	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return(List<Customer>) sessionFactory.getCurrentSession().createQuery("from customer").list();
	}
	

	@Override
	public void saveOrUpdate(Customer cust) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(cust);
		transaction.commit();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(id);
		transaction.commit();
	}

}
