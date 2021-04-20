package com.dzb.Zadaca_2.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dzb.Zadaca_2.domain.Product;
import com.dzb.Zadaca_2.domain.repository.ProductRepository;
import com.dzb.Zadaca_2.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

  
  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return productRepository.getAllProducts();
  }

  public Product getProductById(String productID) {
    return productRepository.getProductById(productID);
  }
  public List<Product> getProductsByCategory(String category) {
	  return productRepository.getProductsByCategory(category);
	}

public void addProduct(Product product) {
   productRepository.addProduct(product);
}


}
