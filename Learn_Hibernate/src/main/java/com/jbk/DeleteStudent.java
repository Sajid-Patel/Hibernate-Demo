package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Student student = new Student();
		student.setId(2); // this will delete the data associated with Id =2 // Student student2 = new
							// Student(2, "Patel", 25);
		session.delete(student);

		session.beginTransaction().commit();

		System.out.println("deleted");
	}

}
