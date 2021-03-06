package com.dzb.Zadaca_2.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dzb.Zadaca_2.domain.Product;
import com.dzb.Zadaca_2.domain.repository.ProductRepository;
import com.dzb.Zadaca_2.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService; 

  @RequestMapping
  public String list(Model model) {
	  model.addAttribute("products", productService.getAllProducts());

	  
	  return "products";


  }
 
  @RequestMapping("/all")
  public String allProducts(Model model) {
    model.addAttribute("products", productService.getAllProducts());

    
  return "products";
  }
  @RequestMapping("/{category}")
  public String getProductsByCategory(Model model, 
  @PathVariable("category") String productCategory) {
    model.addAttribute("products", 
  productService.getProductsByCategory(productCategory));
    return "products";
  }
  @RequestMapping("/product")
  public String getProductById(@RequestParam("id") String productId, Model model) {
    model.addAttribute("product", 
  productService.getProductById(productId));
    return "product";
  }

  @RequestMapping(value =  "/add", method =  RequestMethod.GET)
  public String getAddNewProductForm(Model model) {
     Product newProduct =  new Product();
     model.addAttribute("newProduct", newProduct);
     return "addProduct";
  }

     
  @RequestMapping(value =  "/add", method =  RequestMethod.POST)
  public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
     productService.addProduct(newProduct);
     return "redirect:/products";
  }

}
