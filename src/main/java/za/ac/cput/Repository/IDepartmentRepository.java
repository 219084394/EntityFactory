package za.ac.cput.Repository;

/*
   EntityFactory.java
   IDepartmentRepository
   Author: Keenan Solomons (219264228)
   Date: 25 July 2021
*/

import za.ac.cput.Entity.Department;

import java.util.Set;

public interface IDepartmentRepository extends IRepository<Department, String>{
    public Set<Department> getAll();
}
