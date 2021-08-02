package za.ac.cput.Repository;

/*StudentRepositoryTest.java
 * Student Repository Test code
 * @author Anicka Schouw 217284183
 * July 2021
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Student;
import za.ac.cput.Factory.StudentFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class StudentRepositoryTest {
    private static StudentRepository repository = StudentRepository.getRepository();
    private static Student student = StudentFactory.build(217284183,"Anicka","Schouw","217284183@mycput.ac.za");

    @Test
    void a_create(){
        Student created = repository.create(student);
        assertEquals(created.getStudentNo(),student.getStudentNo());
        System.out.println("Student created: "+created);
    }

    @Test
    void b_read(){
        Student read = repository.read(student.getStFname());
        assertNotNull(read);
        System.out.println("Read student: "+read);
    }

    @Test
    void c_update(){
        Student updated = new Student.StudentBuilder().copy(student).setStLname("Abrahams").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated Student: "+ updated);
    }

    @Test
    void e_delete(){
        boolean removed = repository.delete(student.getStEmail());
        assertTrue(removed);
        System.out.println("Student deleted: "+ removed);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All contents:");
        System.out.println(repository.getALL());
    }
}