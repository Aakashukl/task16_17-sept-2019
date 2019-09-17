package com.Task_16;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class AddEmpData {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();

		Emp e1 = new Emp(1, "chirag", 2500, new Laptop("L111"));
		e1.getProjects().add(new Project("p111"));
		e1.getProjects().add(new Project("p112"));
		e1.getProjects().add(new Project("p113"));
		
		
		Emp e2 = new Emp(2, "shivam", 500, new Laptop("L112"));
		e2.getProjects().add(new Project("p113"));
		e2.getProjects().add(new Project("p114"));
		e2.getProjects().add(new Project("p115"));
		
		Emp e3 = new Emp(3, "manav", 200, new Laptop("L113"));
		e3.getProjects().add(new Project("p111"));
		e3.getProjects().add(new Project("p114"));
		e3.getProjects().add(new Project("p115"));
		
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Saved");
	}

}
