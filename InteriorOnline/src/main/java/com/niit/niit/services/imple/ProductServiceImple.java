package com.niit.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;
import com.niit.services.ProductServices;

@Service
@Transactional
public class ProductServiceImple implements ProductServices {

	@Autowired
	private ProductDAO pdtDAO;

	public void addProduct(Product product) {
		pdtDAO.addProduct(product);
	}

	public void updateProduct(Product product) {
		pdtDAO.updateProduct(product);

	}

	public void deleteProduct(Product product) {
		pdtDAO.deleteProduct(product);

	}

	public List<Product> viewProduct() {
		return pdtDAO.viewProduct();
	}

}
