package za.ac.cput.Entity;
/*
Description: Test class for Lecturer
Author: Lukhona Tetyana
Student number: 218119321
Date: 10 June 2021

 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest      {

    @Test
    void testEquality(){
        Lecturer lecturer1= new Lecturer.Builder().setId("387531").build();
        Lecturer lecturer2= lecturer1;
        assertEquals(lecturer2,lecturer1);
    }

    @Test
    void testIdentity(){
        Lecturer lecturer1= new Lecturer.Builder().setId("387531").build();
        Lecturer lecturer2= lecturer1;
        assertEquals(lecturer2,lecturer1);

    }
    @Disabled
    @Test void testEntity(){
        Lecturer l = new Lecturer.Builder().setName("Lukhona").build();
        System.out.println(l);
    }


    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(5000),() ->{
            Thread.sleep(100);
            System.out.println("Time out");
        });
    }



}