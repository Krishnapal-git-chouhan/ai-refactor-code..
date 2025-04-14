package com.hiber;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hiber.entities.Student;
import com.hiber.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student s = new Student();
        
        s.setName("A");
        s.setClg("iit");
        s.setPhone("117887");
        s.setFatherName("b");
        
        SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getSessionFactory();
        
        
        Session se =  sessionFactory.openSession();
        
        Transaction transaction = null;
        
        try {

			transaction = (Transaction) se.beginTransaction();
			
//			se.persist(s);
			transaction.commit();
			
			System.out.println("student save succefully");
	     } catch (Exception e) {
	    	 
	    	 if(transaction != null) {
	    		 transaction.rollback();
	    	 }
	    	 e.printStackTrace();
		}
        
        finally {
			se.close();
		}
     }
}
