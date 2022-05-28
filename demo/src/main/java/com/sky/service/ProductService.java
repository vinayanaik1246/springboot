package com.sky.service;

import java.util.List;

import com.sky.model.Product;
import com.sky.repository.ProductRepository;

public interface ProductService {
	
	public void addProduct(Product product);
	
	
	public List<Product> getProducts();
	public  Product getProductById(String id);
	
	public Product deleteById(String id);
	
	public Product updateById(Product product);
		
	

}
