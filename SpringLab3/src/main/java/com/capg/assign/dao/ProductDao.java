package com.capg.assign.dao;

import com.capg.assign.entity.Product;

public interface ProductDao {

	 Product addProduct(Product product);
	 Product retrieveProductById(int pId);
}
