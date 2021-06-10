package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

/* EntityFactory.java
 DepartmentTest
 Author: Keenan Solomons (219264228)
 Date: 10 June 2021
*/

class DepartmentTest {

    Department department1, department2, department3;

    @BeforeEach
    void setUp() {
        department1 = new Department.Builder().build();
        department2 = new Department.Builder().setDepCode("002")
                .setDepName("Information Technology").setOfficeNo(555-6328).build();
        department3 = DepartmentFactory.build("008", "Marketing", 555-6335);
        department1 = department2;
    }

    @Test
    void testObjectIdentity(){
        assertSame(department1, department2);
    }
    @Test
    void testObjectEquality(){
        assertEquals(department1 ,department2);
    }

    @Timeout(100)
    @Test
    void testTimeouts(){
        assertEquals(department1,department2);
    }

    @Disabled
    @Test
    void testDisabling(){
        assertNotEquals(department1.getDepName(), department3.getDepName());
        System.out.println("Disabling");
    }
}