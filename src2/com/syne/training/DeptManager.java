package com.syne.training;

import java.util.ArrayList;
import java.util.List;

public class DeptManager implements Manager<Department> {
	private static List<Department> departments = new ArrayList<>();

	@Override
	public List<Department> getList() {
		return departments;
	}

	@Override
	public void update(Department dept) {
		departments.replaceAll(d -> {
			if (d.getDeptId() == dept.getDeptId()) {
				d.setLocation(dept.getLocation());
				d.setName(dept.getName());
			}
			return d;
		});

	}
}
