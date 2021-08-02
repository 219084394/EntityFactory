package za.ac.cput.Service;

import za.ac.cput.Entity.Department;

import java.util.Set;

/*
   EntityFactory.java
   IDepartmentService
   Author: Keenan Solomons (219264228)
   Date: 2 August 2021
*/

public interface IDepartmentService extends IService<Department, String>{
    Set<Department> getAll();
}
