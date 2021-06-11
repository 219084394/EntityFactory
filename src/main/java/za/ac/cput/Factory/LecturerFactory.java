package za.ac.cput.Factory;
/*
Description:  Factory class for Lecturer
Author: Lukhona Tetyana
Student number: 218119321
Date: 10 June 2021

 */

import za.ac.cput.Entity.Lecturer;

public class LecturerFactory {

public static Lecturer createLecturer(String name, String surname, String id){
         Lecturer lecturer   = new Lecturer.Builder()
                 .setSurname(surname)
                 .setName(name)
                 .setId(id)
                 .build();
return lecturer;

}
}
