package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Department;
import za.ac.cput.Factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DepartmentRepositoryTest {
    private static DepartmentRepository repository = DepartmentRepository.getRepository();
    private static Department department = DepartmentFactory.build("008","Information Technology",5553695);

    @Test
    void a_create(){
        Department created = repository.create(department);
        assertEquals(created.getDepCode(), department.getDepCode());
        System.out.println("Create: " + created);
    }
    @Test
    void b_read() {
        Department read = repository.read(department.getDepCode());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void c_update()
    {
        Department updated = new Department.Builder().copy(department).setDepName("Marketing").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update:" + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(department.getDepCode());
        assertTrue (success);
        System.out.println("Delete:" + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }

}