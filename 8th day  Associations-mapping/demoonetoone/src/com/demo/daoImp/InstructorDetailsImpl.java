package com.demo.daoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.InstructorDetailsDao;
import com.demo.entity.InstructorDetails;
import com.demo.util.HibernateUtil;

public class InstructorDetailsImpl implements InstructorDetailsDao{
	
	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;

	@Override
	public void saveInstructorDetail(InstructorDetails instructorDetail) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(instructorDetail);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
		
	}

	@Override
	public void updateInstructorDetails(InstructorDetails instructorDetail) {
		
	}

	@Override
	public InstructorDetails getInstructorDetail(int id) {
		
		return null;
	}

}
