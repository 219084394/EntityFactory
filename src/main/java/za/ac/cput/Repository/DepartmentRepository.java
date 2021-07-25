package za.ac.cput.Repository;

/*
   EntityFactory.java
   DepartmentRepository
   Author: Keenan Solomons (219264228)
   Date: 25 July 2021
*/


import za.ac.cput.Entity.Department;

import java.util.HashSet;
import java.util.Set;

public class DepartmentRepository implements IDepartmentRepository{
    private static DepartmentRepository repository = null;
    private Set<Department> departmentDB = null;

    private DepartmentRepository(){
        departmentDB = new HashSet<Department>();
    }
    public static DepartmentRepository getRepository()
    {
        if (repository == null)
        {
            repository = new DepartmentRepository();
        }
        return repository;
    }

    @Override
    public Department create(Department department) {
        boolean success = departmentDB.add(department);
        if (!success)
            return null;
        return department;
    }

    @Override
    public Department read(String depCode) {
        for (Department d : departmentDB)
            if (d.getDepCode().equals(depCode))
            {
                return d;
            }
        return null;
    }

    @Override
    public Department update(Department department) {
        Department discontinuedDepartment = read(department.getDepCode());
        if (discontinuedDepartment != null)
        {
            departmentDB.remove(discontinuedDepartment);
            departmentDB.add(department);
            return department;
        }
        return null;
    }

    @Override
    public boolean delete(String depCode) {
        Department departmentToDelete = read(depCode);
        if (departmentToDelete == null)
            return false;
        departmentDB.remove(departmentToDelete);
        return true;
    }

    @Override
    public Set<Department> getAll() {
        return departmentDB;
    }
}
