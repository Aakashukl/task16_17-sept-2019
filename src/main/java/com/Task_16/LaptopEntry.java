package com.Task_16;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
	
		Laptop l1 = new Laptop("L111", "DELL", 50000);
		Laptop l2 = new Laptop("L112", "HCL", 70000);
		Laptop l3 = new Laptop("L113", "HP", 40000);

		Transaction tr = session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}

}
