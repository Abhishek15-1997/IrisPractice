package com.iris.Daos;

import java.util.List;

import com.iris.Entities.Departments;

public interface DepartmentDao {
	public boolean addDepartment(Departments e);
	public Departments getDepartment(int id);
	public List<Departments> getAllDepartment();
}
