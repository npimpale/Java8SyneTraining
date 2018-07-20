package com.syn.training.java8.streams;


public class TestDept {

	public static void main(String[] args) {
		DeptManager dmanager = new DeptManager();
		Department dept = new Department(1, "Blockchain", "6th floor-B");
		dmanager.create(dept);
		dept = new Department(2, "Wells", "6th floor-A");
		dmanager.create(dept);
		System.out.println("-------after create");
		dmanager.list().forEach(System.out::println);
		
		dmanager.delete(d -> d.getDeptId() == 1);
		System.out.println("-------after delete");
		dmanager.list().forEach(System.out::println);
		
		dept = new Department(3, "AQR", "2nd floor");
		dmanager.create(dept);
		System.out.println("-------before update");
		dmanager.list().forEach(System.out::println);
		dmanager.update(new Department(3, "ARQ", "3rdfloor"));
		System.out.println("-------after update");
		dmanager.list().forEach(System.out::println);		
		/*
		EmpManager empManager = new EmpManager();
		Employee emp = new Employee(1, "Nikhil", 1000.0);
		empManager.create(emp);

		emp = new Employee(2, "Pimpale", 2000.0);
		empManager.create(emp);
		empManager.list().forEach(System.out::println);
		empManager.delete(e -> e.getEmpId() == 2);
		empManager.list().forEach(System.out::println);*/
	}

}
