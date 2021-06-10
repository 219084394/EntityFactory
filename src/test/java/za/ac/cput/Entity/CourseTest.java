package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Factory.CourseFactory;

import static org.junit.jupiter.api.Assertions.*;

/* EntityFactory.java
 CourseTest
 Author: Keenan Solomons (219264228)
 Date: 10 June 2021
*/


class CourseTest {

    Course course1, course2, course3;

    @BeforeEach
    void setUp(){
        course1 = new Course.Builder().setCourseCode("372S")
                .setCourseName("ADP").build();
        course2 = new Course.Builder().build();
        course3 = CourseFactory.build("362S","PRJ");
        course2 = course1;
    }

    @Test void testObjectIdentity(){
        assertSame(course1,course2);
    }

    @Test
    void testObjectEquality(){
        assertEquals(course1,course2);
    }

    @Timeout(100)
    @Test
    void testTimeouts(){
        assertEquals(course1.getCourseName(),course2.getCourseName());
    }

    @Disabled
    @Test
    void testDisabling(){
        assertNotEquals(course1.getCourseCode(), course3.getCourseCode());
        System.out.println("Disabling");
    }
}