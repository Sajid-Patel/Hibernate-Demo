package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveStudent {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Student student = session.get(Student.class, 4);

		System.out.println(student);
	}

}
