package com.capg.assign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.assign.dao.ProductDao;
import com.capg.assign.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}
	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	@Override
	public Product addProduct(Product product) {
		
		product= productDao.addProduct(product);
		return product;
	}
	
	@Override
	public Product retrieveProductById(int pId) {
	
		Product product= productDao.retrieveProductById(pId);
		return product;
	}
	
	

}
