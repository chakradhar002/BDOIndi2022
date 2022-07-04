package com.demo.daoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.InstructorDao;
import com.demo.entity.Instructor;
import com.demo.util.HibernateUtil;

public class InstructorDaoImpl implements InstructorDao {
	
	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;


	@Override
	public void saveInstructor(Instructor instructor) {
	
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(instructor);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
	}

	@Override
	public void updateInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInstructor(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instructor getInstructorById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
