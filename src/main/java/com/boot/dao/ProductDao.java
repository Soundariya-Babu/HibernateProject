package com.boot.dao;

import java.util.List;
import java.lang.Integer;


import com.boot.model.ProductModel;

public interface ProductDao {

	 public  <T> void insert(T type);
	 public List<ProductModel> display();
	 public ProductModel getById(int id);
	 public  void delete(Integer id);

}
