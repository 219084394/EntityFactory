package za.ac.cput.Entity;
/*Student Test.java
* Test based on the Student Builder Class
* @author: Anicka Schouw 217284183
* June 2021
 */
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testEquality(){
        Student student1 = new Student.StudentBuilder().setStFname("Anicka").build();
        Student student2 = student1;
        assertEquals(student1,student2);
    }

    @Test
    void testIdentity(){
        Student student1 = new Student.StudentBuilder().setStLname("Schouw").build();
        Student student3 = student1;
        assertSame(student1,student3);
    }

    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(200),()->{
            Thread.sleep(1000);
            System.out.println("Time has run out");
        });

    }
    @Disabled
    @Test
    void testStudentEntity(){
        Student student = new Student.StudentBuilder().setStudentNo(217284183).setStFname("Anicka").setStLname("Schouw").setStEmail("217284183@mycput.ac.za").build();
        System.out.println(student);
    }

}