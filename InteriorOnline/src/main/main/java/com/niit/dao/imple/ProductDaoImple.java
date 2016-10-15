package com.niit.dao.imple;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Repository
public class ProductDaoImple implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void addProduct(Product product) {
		Session session = sessionFactory.openSession();
		System.out.println("----Session Created----");
		Transaction transaction =(Transaction) session.beginTransaction();
		System.out.println("----Creating Transaction----");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getCategory());
		System.out.println(product.getPrice());
		session.saveOrUpdate(product);
		System.out.println("----Saving Data----");
		transaction.commit();		
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void updateProduct(Product product) {
		Session s1 =sessionFactory.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.get(Product.class, product.getId());
		s1.update(product);
		System.out.println("----updating data----");
		t1.commit();
		
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public void deleteProduct(Product product) {
		Session s2 =sessionFactory.openSession();
		Transaction t2 = s2.beginTransaction();
		s2.get(Product.class, product.getId());
		s2.delete(product);
		System.out.println("----deleting data----");
		t2.commit();
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public List<Product> viewProduct() {
		return ( List<Product>)sessionFactory.openSession().createCriteria(Product.class).list();
	}

}
