package za.ac.cput.Repository;

import za.ac.cput.Entity.Department;

import java.util.Set;

public interface IDepartmentRepository extends IRepository<Department, String>{
    public Set<Department> getAll();
}
