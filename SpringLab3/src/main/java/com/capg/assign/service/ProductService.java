package com.capg.assign.service;

import com.capg.assign.entity.Product;

public interface ProductService {
	
	 Product addProduct(Product product);
	 Product retrieveProductById(int pId);

}
