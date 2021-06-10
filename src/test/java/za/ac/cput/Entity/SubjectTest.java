package za.ac.cput.Entity;

/* Liam Stewart
 * 219084394
 * Group 21
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.SubjectFactory;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test void testEquality() {
        //Entity
        Subject subject1 = new Subject.SubjectBuilder().setSubjectCode("121")
                .setSubjectName("adp")
                .setTime("11:00")
                .setDate("June 4")
                .build();
        //Factory
        Subject subject2 = SubjectFactory.build("121","adp","11:00","June 4");
        Subject subject3 = subject2;
        assertEquals(subject3, subject2);
        System.out.println("subject2:"+subject2);
        System.out.println("subject3:"+subject3);
    }

    @Test void testIdentity() {
        //Entity
        Subject subject1 = new Subject.SubjectBuilder().setSubjectCode("121")
                .setSubjectName("adp")
                .setTime("11:00")
                .setDate("June 4")
                .build();
        //Factory
        Subject subject2 = SubjectFactory.build("121","adp","11:00","June 4");
        Subject subject3 = subject2;
        assertSame(subject3, subject2);
        System.out.println("subject2:"+subject2);
        System.out.println("subject3:"+subject3);
    }

    @Disabled
    @Test void testTimeout(){
        assertTimeout(Duration.ofMillis(100),() ->{
            Thread.sleep(5000);
            System.out.println("Timed out");
        });
    }

    //disabled test class
    @Disabled
    @Test void testFactory(){
        Subject se = SubjectFactory.build("500","Math","09:00","June 4");
        System.out.println(se);
        assertNotNull(se);
    }



}