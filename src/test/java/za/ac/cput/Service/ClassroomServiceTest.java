package za.ac.cput.Service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Classroom;
import za.ac.cput.Factory.ClassroomFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ClassroomServiceTest {
    private static ClassroomService service = ClassroomService.getService();
    private static Classroom classroom = ClassroomFactory.build("A10");

    @Test
    void a_create(){
        Classroom created = service.create(classroom);
        assertEquals(created.getClassCode(),classroom.getClassCode());
        System.out.println("Created: " + created);
    }


    @Test
    void b_read(){
        Classroom read = service.read(classroom.getClassCode());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        Classroom updated = new Classroom.ClassBuilder().copy(classroom).setClassCode("B9").build();
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete(){
        boolean deleted = service.delete(classroom.getClassCode());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All: ");
        System.out.println(service.getAll());
    }
}