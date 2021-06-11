package za.ac.cput.Entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Building;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* Wajedien Samuels
    216287820
 */
class BuildingTest {

    @Test
    void testEquality(){
        Building building1 = new Building.Builder().setBuildCode("1000").setBuildName("Tech").build();
        Building building2 = building1;
        assertEquals(building2, building1);

    }

    @Test
    void testIdentity() {

        Building building1 = new Building.Builder().setBuildCode("1000").setBuildName("Tech").build();
        Building building2 = building1;
        assertSame(building2, building1);
    }

    @Disabled
    @Test
    void testTimeout() {

        assertTimeout(Duration.ofMinutes(100), () -> {
            Thread.sleep(2000);

            System.out.println("Test Timed out");
        });
    }



}