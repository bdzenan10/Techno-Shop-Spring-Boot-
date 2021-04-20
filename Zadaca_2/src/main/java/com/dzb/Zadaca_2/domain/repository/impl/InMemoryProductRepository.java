package com.dzb.Zadaca_2.domain.repository.impl;

import java.math.BigDecimal; import java.util.ArrayList; import java.util.List;
import org.springframework.stereotype.Repository;
import com.dzb.Zadaca_2.domain.Product;
import com.dzb.Zadaca_2.domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository{

  
  private List<Product> listOfProducts =  new ArrayList<Product>();

  
  public InMemoryProductRepository() {
    Product masina =  new Product("P1234","Masina za ves indesit - IWC 71251", new BigDecimal(500));
    masina.setDescription("Indesit ves masina, IWC 71251");
    masina.setCategory("Ves masina");
    masina.setManufacturer("Indesit");
    masina.setUnitsInStock(1000);

    
    Product masina1 =  new Product("P1235","Masina za vs Indesit - BWA 61252", new BigDecimal(700));
    masina1.setDescription("Indesit masina za  ves BWA 61252");
    masina1.setCategory("Ves masina");
    masina1.setManufacturer("Indesit");
    masina1.setUnitsInStock(1000);

    
    Product masina3 =  new Product("P1236","Masina za ves Indesit - BWA 76588", new BigDecimal(300));
    masina3.setDescription("Indesit model BWA 76558");
    masina3.setCategory("Ves masina");
    masina.setManufacturer("Indesit");
    masina3.setUnitsInStock(1000);
    
    
    Product masina4 =  new Product("P1237","Masina za ves Indesit - BWB 8544", new BigDecimal(500));
    masina4.setDescription("Masina za ves Indesit - BWB 8544");
    masina4.setCategory("Ves Masina");
    masina4.setManufacturer("Indesit");
    masina4.setUnitsInStock(1000);
    
    
    Product tv1=  new Product("P1238","LG Smart TV", new BigDecimal(500));
    tv1.setDescription("Smart LG TV sa bezbroj mogucnosti");
    tv1.setCategory("TV");
    tv1.setManufacturer("LG");
    tv1.setUnitsInStock(1000);
    
    
    Product tv2 =  new Product("P1239","Samsung Smart TV", new BigDecimal(700));
    tv2.setDescription("Smart Samsung TV sa bezbroj mogucnosti");
    tv2.setCategory("TV");
    tv2.setManufacturer("Samsung");
    tv2.setUnitsInStock(1000);
    
    Product tv3 =  new Product("P1230","Trion Smart TV", new BigDecimal(700));
    tv3.setDescription("Trion Smart TV");
    tv3.setCategory("TV");
    tv3.setManufacturer("Trion");
    tv3.setUnitsInStock(1000);
    
    Product tv4 =  new Product("P1231","Sony Smart TV", new BigDecimal(300));
    tv4.setDescription("Sony Smart TV");
    tv4.setCategory("TV");
    tv4.setManufacturer("Sony");
    tv4.setUnitsInStock(1000);
    
    
    Product f1 =  new Product("P1","Sasmsung Frizider", new BigDecimal(1200));
    f1.setDescription("Samsung smart frizider");
   f1.setCategory("Fridge");
    f1.setManufacturer("Samsung");
    f1.setUnitsInStock(1000);
    
    Product f2 =  new Product("P2","LG Frizider", new BigDecimal(1000));
    f2.setDescription("LG smart frizider");
    f2.setCategory("Fridge");
    f2.setManufacturer("LG");
    f2.setUnitsInStock(1000);
    
    
    listOfProducts.add(masina);
    listOfProducts.add(masina1);
    listOfProducts.add(masina3);
    listOfProducts.add(masina4);
    
    listOfProducts.add(tv1);
    listOfProducts.add(tv2);
    listOfProducts.add(tv3);
    listOfProducts.add(tv4);
    listOfProducts.add(f1);
    listOfProducts.add(f2);
    

  }

  public List<Product> getAllProducts() {
    return listOfProducts;
  }
  public Product getProductById(String productId) {
	    Product productById =  null;

	    
	    for(Product product : listOfProducts) {
	      if(product!=null && product.getProductId()!=null && 
	product.getProductId().equals(productId)){
	        productById =  product;
	        break;
	      }
	    }

	    
	    if(productById ==  null){
	      throw new IllegalArgumentException("Nema proizvoda sa tim ID: "+ productId);
	    }

	    
	    return productById;
	}
  public List<Product> getProductsByCategory(String category) {
	  List<Product> productsByCategory =  new ArrayList<Product>();

	    
	  for(Product product: listOfProducts) {
	    if(category.equalsIgnoreCase(product.getCategory())){
	      productsByCategory.add(product);
	    }
	  }

	  
	  return productsByCategory;
	}

  public void addProduct(Product product) {
	   listOfProducts.add(product);
	}

}
