package za.ac.cput.Entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class SeatTest {

    @Test
    void testEquality() {
        //Entity
        Seat seat1 = new Seat.Builder().setClassCode("99").setSeatNo(121)
                .build();

        Seat seat2 = seat1;
        assertEquals(seat2, seat1);
        System.out.println("seatNo:"+seat2);
        System.out.println("seatNo:"+seat1);
    }

    @Test void testIdentity() {
        Seat seat1 = new Seat.Builder().setClassCode("99").setSeatNo(101)
                .build();

        Seat seat2 = seat1;
        assertSame(seat2, seat1);
        System.out.println("seatNo:"+seat2);
        System.out.println("seatNo:"+seat1);
    }

    @Disabled
    @Test void testTimeout(){
        assertTimeout(Duration.ofMillis(100),() ->{
            Thread.sleep(5000);
            System.out.println("Timed out");
        });
    }
}
