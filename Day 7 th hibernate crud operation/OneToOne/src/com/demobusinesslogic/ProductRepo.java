package com.demobusinesslogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.entity.Product;
import com.demo.factory.HibernateUtil;

public class ProductRepo {

	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;

	// logic part create product or add product
	public static Product createProduct(Product p) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(p);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
		return p;

	}

	// view product
	public static Product viewProduct(Product p) {
		return p;

	}

	// update product
	public static Product updateProduct(Product p) {
		return p;

	}

// delete product
	public static Product deleteProductByid(Product p) {
		return p;

	}

}
