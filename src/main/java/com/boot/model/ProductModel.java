package com.boot.model;

import javax.persistence.Column;
import java.lang.Integer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_model")
public class ProductModel {
	 @Id
	 @Column(name = "id") 
	private Integer id;


	@Column(name = "product_name")
	private String productName;
	
	

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", productName=" + productName + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public ProductModel() {

	}



}
