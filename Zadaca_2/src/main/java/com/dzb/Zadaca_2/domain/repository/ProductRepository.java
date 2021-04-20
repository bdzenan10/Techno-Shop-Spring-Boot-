package com.dzb.Zadaca_2.domain.repository;

import java.util.List;


import com.dzb.Zadaca_2.domain.Product;

public interface ProductRepository {	
	List <Product> getAllProducts();
	
	Product getProductById(String productID);
	List<Product> getProductsByCategory(String category);
	
	void addProduct(Product product);
}

