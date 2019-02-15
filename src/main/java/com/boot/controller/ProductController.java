package com.boot.controller;
import java.util.List;
import java.lang.Integer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.ProductModel;
import com.boot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService productServiceObj;
@PostMapping("/save")	 
	public String Store(@RequestParam("productId") Integer productId, 
			@RequestParam("productName") String productName) 
	{   
	ProductModel pm=new ProductModel();
	pm.setProductName(productName);
	pm.setId(productId);
	productServiceObj.insert(pm);
		
		return "success";
	}
@GetMapping("/display")
public  List<ProductModel> displayProduct()
{  
	List<ProductModel> pm=productServiceObj.display();
	
	return pm; 
}

@GetMapping ("/getbyid")
public ProductModel diplayById(@RequestParam("productId") Integer productId)
{
	ProductModel pm=productServiceObj.getById( productId);
	return pm;
	
}
@DeleteMapping("/delete")
public String Store(@RequestParam("productId") Integer productId)
{
	productServiceObj.delete(productId);
	return "success";
}
}

