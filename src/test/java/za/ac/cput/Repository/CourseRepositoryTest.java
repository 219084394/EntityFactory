package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Course;
import za.ac.cput.Factory.CourseFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CourseRepositoryTest {
    private static CourseRepository repository = CourseRepository.getRepository();
    private static Course course = CourseFactory.build("262S","Applications Development Practice");

    @Test
    void a_create(){
        Course created = repository.create(course);
        assertEquals(created.getCourseCode(), course.getCourseCode());
        System.out.println("Create: " + created);
    }
    @Test
    void b_read() {
        Course read = repository.read(course.getCourseCode());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void c_update()
    {
        Course updated = new Course.Builder().copy(course).setCourseName("Applications Development Theory").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update:" + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(course.getCourseCode());
        assertTrue (success);
        System.out.println("Delete:" + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }

}