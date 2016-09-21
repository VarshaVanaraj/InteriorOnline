package com.niit.dao;
import com.niit.model.ModelProduct;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDAOImpl implements ProductDAOInterface {
	
	public void addProduct(ModelProduct p) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(ModelProduct p) {
		// TODO Auto-generated method stub
		
	}

	public List<ModelProduct> listProduct() {
		ModelProduct p1 = new ModelProduct();
		p1.setId(7);
		p1.setName("swing");
		p1.setCategory("light");
		p1.setPrice(4000);
 
		ModelProduct p2 = new ModelProduct();
		p2.setId(8);
		p2.setName("dining table");
		p2.setCategory("furniture");
		p2.setPrice(35000);
 
		LinkedList<ModelProduct> l=new LinkedList<ModelProduct>();
		l.add(p1);
		l.add(p2);
		return l;	
	}

	public void removePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
