package za.ac.cput.Factory;

import za.ac.cput.Entity.Course;

public class CourseFactory {

    public static Course courseChosen(String courseCode, String courseName){

        Course course = new Course.Builder()
                .setCourseCode(courseCode)
                .setCourseName(courseName)
                .build();

        return course;
    }
}
