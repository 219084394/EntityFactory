package za.ac.cput.Entity;

/* Liam Stewart
 * 219084394
 * Group 21
 */


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.ClassroomFactory;
import za.ac.cput.Factory.SubjectFactory;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    @Test void testEquality(){
        Classroom class1 = new Classroom.ClassBuilder().setClassCode("40A").build();
        Classroom class2 = class1;
        assertEquals(class2,class1);
    }

    @Test void testIdentity(){
        Classroom class1 = new Classroom.ClassBuilder().setClassCode("40A").build();
        Classroom class2 = class1;
        assertSame(class2,class1);
    }

    @Disabled
    @Test void testTimeout(){
        assertTimeout(Duration.ofMillis(100),() ->{
            Thread.sleep(5000);
            System.out.println("Timed out");
        });
    }

    @Disabled
    @Test void testEntity(){
        Classroom c = new Classroom.ClassBuilder().setClassCode("40A").build();
        System.out.println(c);
    }

    @Disabled
    @Test void testFactory(){
        Classroom s = ClassroomFactory.build("40A");
        System.out.println(s);
        assertNotNull(s);
    }

}