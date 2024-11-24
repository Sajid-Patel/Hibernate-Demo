package com.jbk;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		org.hibernate.SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Student student = new Student(3, "Mysha", 15);

		session.update(student);

		session.beginTransaction().commit();

		System.out.println("updateed");

	}

}
