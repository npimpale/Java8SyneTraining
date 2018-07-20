package com.syne.training;

import java.util.ArrayList;
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
}
