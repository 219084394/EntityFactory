package za.ac.cput.Service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Course;
import za.ac.cput.Factory.CourseFactory;


import static org.junit.jupiter.api.Assertions.*;

/*
   EntityFactory.java
   CourseServiceTest
   Author: Keenan Solomons (219264228)
   Date: 2 August 2021
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
class CourseServiceTest {
    private static CourseService service = CourseService.getService();
    private static Course course = CourseFactory.build("372S", "Project3");

    @Test
    void a_create(){
        Course created = service.create(course);
        assertEquals(created.getCourseCode(), course.getCourseCode());
        System.out.println("Created: " + created);
    }
    @Test
    void b_read(){
        Course read = service.read(course.getCourseCode());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void c_update(){
        Course updated = new Course.Builder().copy(course).setCourseName("Professional Practice").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }
    @Test
    void e_delete(){
        boolean success = service.delete(course.getCourseCode());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }
    @Test
    void d_getAll(){
        System.out.println("Display All Courses: ");
        System.out.println(service.getAll());
    }

}