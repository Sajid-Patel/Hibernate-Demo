package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveStudent {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Student student = new Student(1, "Sajid", 24);
		session.save(student);

		Student student2 = new Student(2, "Patel", 25);
		session.save(student2);

		Student student3 = new Student(3, "Mysha", 14);
		session.save(student3);

		Student student4 = new Student(4, "Maira", 9);
		session.save(student4);

		session.beginTransaction().commit();

	}
}
