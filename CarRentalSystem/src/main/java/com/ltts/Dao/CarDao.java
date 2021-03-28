package com.ltts.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.model.Car;



@Repository
public class CarDao {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	public boolean InsertCar(Car c) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(c);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
//		finally {
//			sf.close();
//		}
		
		return b;
	}
	
	
	public List<Car> getAllCars(){
		 Session session=sf.openSession();
	        session.beginTransaction();
	        
	        List<Car> li=sf.openSession().createCriteria(Car.class).list();
	        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();
	        
	        session.getTransaction().commit();
	        return li;
	}
	
	public Car getCarByID(int id){
		 Session session=sf.openSession();
		
			
			  Query query = session.createQuery("from Car where car_id= :id");
			  query.setLong("car_id", id);
			  Car c =  (Car) query.uniqueResult();
			  
			  return c;
			 		
		
	}

}
