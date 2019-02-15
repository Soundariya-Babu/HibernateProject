package com.boot.dao;

import java.util.List;
import java.lang.Integer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.model.ProductModel;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	 public  <T> void insert(T type) {
	  
		      Session session = sessionFactory.getCurrentSession();
		      Transaction tx=session.beginTransaction();
		      session.merge(type);
		    tx.commit();
		      session.close();
		    
	   
	 }
	 
	 public List<ProductModel> display()
	 {
		 Session session = sessionFactory.getCurrentSession();
	      Transaction tx=session.beginTransaction();
	     @SuppressWarnings("unchecked")
		Query<ProductModel> query=session.createQuery("from ProductModel");  
	      
	      List<ProductModel> list=query.list();
	    tx.commit();
	      session.close(); 
	      return list;
	 }

	@Override
	public ProductModel getById(int id) {
		Session session = sessionFactory.getCurrentSession();
	      Transaction tx=session.beginTransaction();
	     ProductModel pm=(ProductModel) session.get(ProductModel.class, id);
	    tx.commit();
	      session.close();
		return pm;
	}
	public  void delete(Integer id) {
		  
	      Session session = sessionFactory.getCurrentSession();
	      Transaction tx=session.beginTransaction();
	      ProductModel  pm=new ProductModel();
	      pm.setId(id);
	      session.delete(pm);
	    tx.commit();
	      session.close();
	    
 
}

}
