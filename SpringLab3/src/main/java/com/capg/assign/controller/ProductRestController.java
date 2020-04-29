package com.capg.assign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.assign.dto.ProductDto;
import com.capg.assign.entity.Product;
import com.capg.assign.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController {
	
	@Autowired
	private ProductService service;
	
	 @PostMapping("/add")
	    public ResponseEntity<Product>addCustomer(@RequestBody ProductDto dto){
	        Product product=convert(dto);
	        product= service.addProduct(product);
	        System.out.println(product);
	        ResponseEntity<Product>response=new ResponseEntity<>(product, HttpStatus.OK);
	        return response;
	    }
	 
	   public Product convert(ProductDto dto){
	       Product product= new Product();
	       product.setProductName(dto.getProductName());
	       product.setProductPrice(dto.getProductPrice());
	        return product;
	   }
	
//	   /**  @GetMapping("/find/{id}")
//    public ResponseEntity<Customer>findById( @PathVariable("id") int            nid){
//     Customer customer=service.findCustomerById(id);
//     ResponseEntity<Customer>response=new ResponseEntity<>(customer,HttpStatus.OK);
//     return response;
//    }
// 
	   @GetMapping("/find/{id}")
	   public ResponseEntity<Product>findById( @PathVariable("id") int id)
	   {
		   Product product = service.retrieveProductById(id);
		   ResponseEntity<Product>response=new ResponseEntity<>(product,HttpStatus.OK);
		   return response;
		   
	   }
	   
	
}
