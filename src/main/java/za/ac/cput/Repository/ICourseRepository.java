package za.ac.cput.Repository;

/*
   EntityFactory.java
   ICourseRepository
   Author: Keenan Solomons (219264228)
   Date: 25 July 2021
*/

import za.ac.cput.Entity.Course;

import java.util.Set;

public interface ICourseRepository extends IRepository<Course, String> {
    public Set<Course> getAll();
}
