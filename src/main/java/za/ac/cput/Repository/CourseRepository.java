package za.ac.cput.Repository;

import za.ac.cput.Entity.Course;

import java.util.HashSet;
import java.util.Set;

public class CourseRepository implements ICourseRepository{
    private static CourseRepository repository = null;
    private Set<Course> courseDB = null;

    private CourseRepository(){
        courseDB = new HashSet<Course>();
    }
    public static CourseRepository getRepository()
    {
        if (repository == null)
        {
            repository = new CourseRepository();
        }
        return repository;
    }

    @Override
    public Course create(Course course) {
        boolean success = courseDB.add(course);
        if (!success)
            return null;
        return course;
    }

    @Override
    public Course read(String courseCode) {
        for (Course c : courseDB)
            if (c.getCourseCode().equals(courseCode))
            {
                return c;
            }
        return null;
    }

    @Override
    public Course update(Course course) {
        Course discontinuedCourse = read(course.getCourseCode());
        if (discontinuedCourse != null)
        {
            courseDB.remove(discontinuedCourse);
            courseDB.add(course);
            return course;
        }
        return null;
    }

    @Override
    public boolean delete(String courseCode) {
        Course courseToDelete = read(courseCode);
        if (courseToDelete == null)
            return false;
        courseDB.remove(courseToDelete);
        return true;
    }

    @Override
    public Set<Course> getAll() {
        return courseDB;
    }
}
