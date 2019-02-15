package com.boot.service;

import java.util.List;
import java.lang.Integer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ProductDao;
import com.boot.model.ProductModel;

@Service
public class ProductServiceImple implements ProductService{
	  @Autowired
	  private ProductDao productDaoObj;
	  
	  public void insert(ProductModel pm)
	  {
		  productDaoObj.insert(pm); 
	  }
	  
	  public List<ProductModel> display()
		 {
		  List<ProductModel> pm= productDaoObj.display();
		  return pm;
         }

	@Override
	public ProductModel getById(int id) {
		ProductModel pm= productDaoObj.getById(id);
		return pm;
	}

	@Override
	public void delete(Integer id) {
		 productDaoObj.delete(id);
	}
	  
	  
}
