package com.Task_16;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectEntry {

	public static void main(String[] args) {

		Session session = Util.getSessionFactory().openSession();

		Project p1 = new Project("p111", "AcSw");
		Project p2 = new Project("p112", "ERP");
		Project p3 = new Project("p113", "BnkSw");
		Project p4 = new Project("p114", "SecApp");
		Project p5 = new Project("p115", "ECommerce");

		Transaction tr = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		tr.commit();
		session.close();
		System.out.println("PROJECT STORED");

	}

}
