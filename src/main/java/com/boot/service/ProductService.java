package com.boot.service;

import java.util.List;

import com.boot.model.ProductModel;
import java.lang.Integer;


public interface ProductService {

	 public void insert(ProductModel pm);

	 public List<ProductModel> display();
	 public ProductModel getById(int id);
	 public  void delete(Integer id);
}

