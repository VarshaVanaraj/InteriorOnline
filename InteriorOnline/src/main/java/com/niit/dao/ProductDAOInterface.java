package com.niit.dao;
import java.util.List;

import com.niit.model.ModelProduct;

public interface ProductDAOInterface {
	public void addProduct(ModelProduct p);
	public void updateProduct(ModelProduct p);
	public List<ModelProduct> listProduct();
	public void removePerson(int id);

}
