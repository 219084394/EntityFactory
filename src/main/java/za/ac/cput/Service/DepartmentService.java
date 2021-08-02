package za.ac.cput.Service;

import za.ac.cput.Entity.Department;
import za.ac.cput.Repository.DepartmentRepository;

import java.util.Set;

/*
   EntityFactory.java
   DepartmentService
   Author: Keenan Solomons (219264228)
   Date: 2 August 2021
*/

public class DepartmentService implements IDepartmentService{
    private static DepartmentService service = null;
    private DepartmentRepository repository = null;

    private DepartmentService(){
        this.repository = DepartmentRepository.getRepository();
    }

    public static DepartmentService getService(){
        if(service == null){
            service = new DepartmentService();
        }
        return service;
    }
    @Override
    public Department create(Department department){
        return this.repository.create(department);
    }
    @Override
    public Department read(String depCode){
        return this.repository.read(depCode);
    }
    @Override
    public Department update(Department department){
        return this.repository.update(department);
    }
    @Override
    public boolean delete(String depCode){
        return this.repository.delete(depCode);
    }
    @Override
    public Set<Department> getAll(){
        return this.repository.getAll();
    }
}
