package za.ac.cput.Service;
/*StudentServiceTest.java
 *Class contains all Student Service Test code
 * @author: Anicka Schouw 217284183
 * August 2021
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Student;
import za.ac.cput.Factory.StudentFactory;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentServiceTest {
    private static StudentService service = StudentService.getService();
    private static Student student = StudentFactory.build(217118198,"Raees","Abrahams","217118198@mycput.ac.za");


    @Test
    void a_create(){
        Student created = service.create(student);
        assertEquals(created.getStFname(),student.getStFname());
        System.out.println("Student created: "+created);
    }

    @Test
    void b_read(){
        Student read = service.read(student.getStFname());
        assertNotNull(read);
        System.out.println("Read Student: "+read);
    }

    @Test
    void c_update(){
        Student updated = new Student.StudentBuilder().copy(student).setStFname("Mohammad Raees").build();
        //assertNotNull(service.update(updated));
        System.out.println("Student updated: "+updated);
    }

    @Test
    void e_delete(){
        boolean removed = service.delete(student.getStFname());
        assertTrue(removed);
        System.out.println("Student removed: "+removed);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all content: ");
        System.out.println(service.getAll());
    }


}