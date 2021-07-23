package za.ac.cput.Entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.RegistrationFactory;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {
    @Test
    void testEquality() {
        //Entity
        Registration student1 = new Registration.RegistrationBuilder().setCourseCode("911")
                .setCourseName("First Aid Training")
                .setStudNumber("219009111")
                .setRegId("1")
                .build();
        //Factory
        Registration student2 = student1;

        assertEquals(student2, student1);
    }

    @Test void testIdentity() {

        Registration student1 = new Registration.RegistrationBuilder().setCourseCode("911")
                .setCourseName("First Aid Training")
                .setStudNumber("219009111")
                .setRegId("1")
                .build();
        //Factory
        Registration student2 = student1;

        assertSame(student2, student1);
    }

    @Disabled
    @Test void testTimeout(){
        assertTimeout(Duration.ofMillis(100),() ->{
            Thread.sleep(5000);
            System.out.println("Timed out");
        });
    }


}