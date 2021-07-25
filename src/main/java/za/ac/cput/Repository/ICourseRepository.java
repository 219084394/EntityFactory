package za.ac.cput.Repository;

import za.ac.cput.Entity.Course;

import java.util.Set;

public interface ICourseRepository extends IRepository<Course, String> {
    public Set<Course> getAll();
}
