package com.niit.services;

import java.util.List;

import com.niit.model.Product;

public interface ProductServices {
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	public List<Product> viewProduct();
}
