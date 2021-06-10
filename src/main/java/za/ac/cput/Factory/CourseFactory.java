package za.ac.cput.Factory;

import za.ac.cput.Entity.Course;

/* EntityFactory.java
 Course Factory
 Author: Keenan Solomons (219264228)
 Date: 09 June 2021
*/

public class CourseFactory {

    public static Course build(String courseCode, String courseName){

        return new Course.Builder()
                .setCourseCode(courseCode)
                .setCourseName(courseName)
                .build();
    }
}
