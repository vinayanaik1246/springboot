package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sky.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	
	@Autowired
	private static List<Product> products=new ArrayList<Product>();
	
	public void addProduct(Product product)
	{
		System.out.println("in repositor");
		products.add(product);
		
	}
	



	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}





	public Product getProductById(String id) {
		for(Product e:products)
		{
		if(e.getProductId().equals(id))
		{
			return e;
		}
		
		
	}
		return null;
	}

	public Product deleteById(String id) {
		int index=0;
		for(Product e:products) {
			if(e.getProductId().equals(id))
			{
					products.remove(index);
					
					return e;
			}
			index=index+1;
			}
		return null;
	}




	@Override
	public Product updateById(Product newproduct) {
		int index=0;
		for(Product e:products)
		{
			if(e.getProductId().equals(newproduct.getProductId()))
					{
						products.set(index, newproduct);
						return newproduct;
					}
			index=index+1;
		}
		return null;
	}

	
}
	
