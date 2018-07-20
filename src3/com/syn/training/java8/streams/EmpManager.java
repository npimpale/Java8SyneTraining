package com.syn.training.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpManager implements Manager<Employee> {
	private static List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> getList() {
		return employees;
	}

	@Override
	public void update(Employee emp) {
		getList().replaceAll(e -> {
			if (e.getEmpId() == emp.getEmpId()) {
				e.setName(emp.getName());
				e.setSalary(emp.getSalary());
			}
			return e;
		});
	}

	public static List<Employee> create() {
		List<String> names = Arrays.asList("Nikhil", "Kunal", "Dhiraj", "Rakhi", "Prajakta", "Tejas", "Haldhar");
		List<String> deptNames = Arrays.asList("HR", "Finance", "Training", "Blockchain", "Wells", "AQR");
		List<String> cities = Arrays.asList("Pune", "Hydrabad", "Mumbai", "Indore");
		List<String> states = Arrays.asList("MH", "AP", "MH", "MP");
		List<String> projects = Arrays.asList("Project1", "Project2", "Project3");

		for (int i = 0; i < 20; i++) {
			Employee emp = new Employee();
			emp.setEmpId(i);
			emp.setName(names.get(i % names.size()));
			emp.setDept(deptNames.get(i % deptNames.size()));
			emp.setProject(projects.get(i % projects.size()));
			emp.setSalary(1 * Math.random() * 1000);
			emp.getAddress().setCity(cities.get(i % cities.size()));
			emp.getAddress().setState(states.get(i % states.size()));
			employees.add(emp);
		}
		return employees;
	}

	public void filter1() {
		List<Employee> list = getList();
		System.out.println("--------------------Filter on project1");
		list.stream().filter(e -> e.getProject().equals("Project1")).forEach(d -> System.out.println(d));
	}

	public void filter2() {
		List<Employee> list = getList();
		System.out.println("--------------------Filter on project1 & pune");
		list.stream().filter(e -> e.getProject().equals("Project1"))
				.filter(e -> e.getAddress().getCity().equals("Pune")).forEach(d -> System.out.println(d));
	}

	public void filter3() {
		List<Employee> list = getList();
		System.out.println("--------------------Filter on project1 or pune");
		list.stream().filter(e -> e.getProject().equals("Project1") || e.getAddress().getCity().equals("Pune"))
				.forEach(d -> System.out.println(d));
	}

	public void limitStream() {
		List<Employee> list = getList();
		System.out.println("--------------------limit stream");
		list.stream().limit(10).forEach(System.out::println);
	}

	public void skipStream() {
		List<Employee> list = getList();
		System.out.println("--------------------skip stream");
		list.stream().skip(10).forEach(System.out::println);
	}

	public static void main(String[] args) throws InterruptedException {
		EmpManager empManager = new EmpManager();
		empManager.create();

	}
}
