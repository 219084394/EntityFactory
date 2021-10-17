package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Course;
import za.ac.cput.Repository.CourseRepository;

import java.util.Set;

/*
   EntityFactory.java
   CourseService
   Author: Keenan Solomons (219264228)
   Date: 2 August 2021
*/
@Service
public class CourseService implements ICourseService{
    private static CourseService service = null;
    private CourseRepository repository = null;

    private CourseService(){
        this.repository = CourseRepository.getRepository();
    }

    public static CourseService getService(){
        if(service == null){
            service = new CourseService();
        }
        return service;
    }
    @Override
    public Course create(Course course){
        return this.repository.create(course);
    }
    @Override
    public Course read(String courseCode){
        return this.repository.read(courseCode);
    }
    @Override
    public Course update(Course course){
        return this.repository.update(course);
    }
    @Override
    public boolean delete(String courseCode){
        return this.repository.delete(courseCode);
    }
    @Override
    public Set<Course> getAll(){
        return this.repository.getAll();
    }
}
