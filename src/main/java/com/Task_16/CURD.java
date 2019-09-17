package com.Task_16;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class CURD {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);

		System.out.println("OPTIONS");
		System.out.println(" 1.READ");
		System.out.println(" 2.INSERTION");
		System.out.println(" 3.UPDATION");
		System.out.println(" 4.DELETION");

		System.out.println("=============================");
		int choice = sc.nextInt();
//		Transaction tr = session.beginTransaction();
		switch (choice) {
		case 1:
			System.out.println("SEARCHING");
			System.out.println("-----------------------------");
			System.out.println("Enter Emp Number");
			int eno = sc.nextInt();
			Emp emp = (Emp) session.get(Emp.class, eno);
			if (emp != null) {
				String lap = emp.getLaptop().getLaptopName();

				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
				System.out.println(emp.getEmpSalary());
				System.out.println(lap);
			}
			break;
		case 2:
			System.out.println("INSERTION");
			System.out.println("-----------------------------");
			System.out.println("enter eno");
			int eno1 = sc.nextInt();
			System.out.println("enter ename");
			String ename1 = sc.next();
			System.out.println("enter esal");
			int esal1 = sc.nextInt();
			System.out.println("enter laptop_code");
			String lcode1 = sc.next();
			System.out.println("enter project_code");
			String pro1 = sc.next();
			Transaction tr = session.beginTransaction();
			Emp employee1 = new Emp(eno1, ename1, esal1, new Laptop(lcode1));
			employee1.getProjects().add(new Project(pro1));
			session.save(employee1);
			tr.commit();
			break;
		case 3:
			System.out.println("UPDATION");
			System.out.println("-----------------------------");
			System.out.println("Enter Emp Number");
			int eno2 = sc.nextInt();
			Emp emp2 = (Emp) session.get(Emp.class, eno2);
			System.out.println("enter ename");
			String ename2 = sc.next();
			System.out.println("enter esal");
			int esal2 = sc.nextInt();
			emp2.setEmpName(ename2);
			emp2.setEmpSalary(esal2);


			Transaction tr1 = session.beginTransaction();
			session.update(emp2);
			tr1.commit();
			System.out.println("Updated");
			break;
		case 4:
			System.out.println("DELETION");
			System.out.println("-----------------------------");
			System.out.println("Enter Emp Number");
			int eno3 = sc.nextInt();
			Emp emp3 = (Emp) session.get(Emp.class, eno3);
			Transaction tr2 = session.beginTransaction();
			session.delete(emp3);
			tr2.commit();
			System.out.println("Deleted");
			break;
		default:
			System.out.println("CHOOSE CORRECT OPTION");
		}
		sc.close();
		session.close();

	}

}
