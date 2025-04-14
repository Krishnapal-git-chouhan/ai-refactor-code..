package com.hiber;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hiber.entities.Student;
import com.hiber.util.HibernateUtil;

public class StudentService {

	private SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getSessionFactory();
	public void saveStudent(Student student) {
		
		try(Session session = sessionFactory.openSession()) {
			
			Transaction beginTransaction = (Transaction) session.beginTransaction();
			session.persist(student);
			beginTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public Student getById(long studentId) {
		try (Session session = sessionFactory.openSession()){
			Student stu = session.get(Student.class, studentId);
			return stu;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null; 
		}
	}
	
	public Student update(long stud_id,Student student) {
		try(Session session = sessionFactory.openSession()) {
			Transaction transaction = (Transaction) session.beginTransaction();
			Student stu = session.get(Student.class, stud_id);
			
			if(stu != null) {
				stu.setName(student.getName());
				stu.setFatherName(student.getFatherName());

				stu = (Student) session.merge(stu);
			}
			transaction.commit();
			return stu;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public void deleteStudent(long stu_id) {
		try(Session session = sessionFactory.openSession()) {
			Transaction transaction = (Transaction) session.beginTransaction();
			Student stu = session.get(Student.class, stu_id);
			
			if(stu != null) {
				session.remove(stu);
			}
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();  
		}
	}
}
