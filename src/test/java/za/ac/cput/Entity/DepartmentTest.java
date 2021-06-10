package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
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
                .setDepName("Information Technology").setOfficeNo(3979643).build();
        department3 = DepartmentFactory.build("008", "Marketing", 3976586);
        department1 = department2;
    }

    @Test
    void testObjectIdentity(){
        assertSame(department1, department2);
    }
    @Test
    void testObjectEquality(){
        assertEquals(department1.getDepCode() ,department2.getDepCode());
    }

    @Timeout(100)
    @Test
    void testTimeouts(){
        assertEquals(department1.getDepName(),department2.getDepName());
    }

    @Test
    void testDisabling(){
        assertNotEquals(department1.getOfficeNo(), department3.getOfficeNo());
        System.out.println("Disabling");
    }
}