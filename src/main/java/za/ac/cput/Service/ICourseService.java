package za.ac.cput.Service;

import za.ac.cput.Entity.Course;
import java.util.Set;

/*
   EntityFactory.java
   ICourseService
   Author: Keenan Solomons (219264228)
   Date: 2 August 2021
*/

public interface ICourseService extends IService<Course, String> {
    Set<Course> getAll();
}
