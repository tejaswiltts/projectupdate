package com.ltts.Dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.model.User;



@Repository
public class UserDao {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	
	public boolean InsertUser(User u) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(u);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		/*
		 * finally { sf.close(); }
		 */
		
		return b;
	}
	
	 

	public User checkMember(String email_id) {
		// TODO Auto-generated method stub
		
		User u = (User)sf.openSession().get(User.class,email_id);
		
		
		return u;
	}



	public User checkUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}


