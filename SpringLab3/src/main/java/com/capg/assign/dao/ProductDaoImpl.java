package com.capg.assign.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.assign.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Product addProduct(Product product)
	{
		product=entityManager.merge(product);
		return product;
	}
	
	public Product retrieveProductById(int pId)
	{
		Product product=entityManager.find(Product.class, pId);
		return product;
	}
	
	
	
}
