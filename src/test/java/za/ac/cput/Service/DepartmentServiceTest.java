package za.ac.cput.Service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Department;
import za.ac.cput.Factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

/*
   EntityFactory.java
   DepartmentServiceTest
   Author: Keenan Solomons (219264228)
   Date: 2 August 2021
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
class DepartmentServiceTest {
    private static DepartmentService service = DepartmentService.getService();
    private static Department department = DepartmentFactory.build("007", "Information Technology", 5553726);

    @Test
    void a_create(){
        Department created = service.create(department);
        assertEquals(created.getDepCode(), department.getDepCode());
        System.out.println("Created: " + created);
    }
    @Test
    void b_read(){
        Department read = service.read(department.getDepCode());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void c_update(){
        Department updated = new Department.Builder().copy(department).setDepName("Marketing").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }
    @Test
    void e_delete(){
        boolean success = service.delete(department.getDepCode());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }
    @Test
    void d_getAll(){
        System.out.println("Display All Departments: ");
        System.out.println(service.getAll());
    }

}