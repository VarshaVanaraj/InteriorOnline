package com.niit.dao.imple;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.custDao;
import com.niit.model.Customer;

@Repository
public class custDaoImple implements custDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addCustomer(Customer customer) {
		System.out.println("----Hello from Registration Dao----");
		Session session = sessionFactory.openSession();
		System.out.println("----Session Created----");
		Transaction transaction =(Transaction) session.beginTransaction();
		System.out.println("----Creating Transaction----");
		System.out.println(customer.getName());
		System.out.println(customer.getId());
		System.out.println(customer.getEmail());
		System.out.println(customer.getUname());
		session.saveOrUpdate(customer);
		System.out.println("----Saving Data----");
		transaction.commit();
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateCustomer(Customer customer) {
		Session s1 =sessionFactory.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.get(Customer.class, customer.getId());
		s1.update(customer);
		System.out.println("----updating data----");
		t1.commit();
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteCustomer(Customer customer){
		Session s2 =sessionFactory.openSession();
		Transaction t2 = s2.beginTransaction();
		s2.get(Customer.class, customer.getId());
		s2.delete(customer);
		System.out.println("----deleting data----");
		t2.commit();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public List<Customer> viewCustomer(){
		Session s3=sessionFactory.openSession();
		List<Customer> custList=s3.createQuery("from Customer").list();
		return custList;
	}

}
