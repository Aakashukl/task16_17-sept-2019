package com.Task_16;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class VehicleEntry {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		
		Vehicle v1 = new Vehicle(11, "Mahindra", "SUV", 2500000, new Emp(1));
		Vehicle v2 = new Vehicle(22, "Renault", "duster", 5500000, new Emp(2));
		Vehicle v3 = new Vehicle(33, "Toyota,", "Yaris", 1100000, new Emp(3));
		Vehicle v4 = new Vehicle(44, "Mahindra", "SUV", 2500000, new Emp(3));
		Vehicle v5 = new Vehicle(55, "Renault", "duster", 5500000, new Emp(2));
		Vehicle v6 = new Vehicle(66, "Toyota,", "Yaris", 1100000, new Emp(1));

		Transaction tr = session.beginTransaction();
		session.save(v1);
		session.save(v2);
		session.save(v3);
		session.save(v4);
		session.save(v5);
		session.save(v6);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
		
	}

}
