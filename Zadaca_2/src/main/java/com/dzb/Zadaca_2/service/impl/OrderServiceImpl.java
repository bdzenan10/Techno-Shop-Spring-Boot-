package com.dzb.Zadaca_2.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dzb.Zadaca_2.domain.Product;
import com.dzb.Zadaca_2.domain.repository.ProductRepository;
import com.dzb.Zadaca_2.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{ 
  @Autowired
  private ProductRepository productRepository;

  
  public void processOrder(String productId, long quantity) {
    Product productById =  productRepository.getProductById(productId);

    
    if(productById.getUnitsInStock() <  quantity){
      throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
    }

    
    productById.setUnitsInStock(productById.getUnitsInStock() - 
quantity);
  }


public void processOrder(String productId, int count) {
	// TODO Auto-generated method stub
	
}
}
