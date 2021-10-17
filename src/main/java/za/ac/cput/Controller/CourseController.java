package za.ac.cput.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Course;
import za.ac.cput.Factory.CourseFactory;
import za.ac.cput.Service.CourseService;

import java.util.Set;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping(value = "/create")
    public Course create(@RequestBody Course course){
        Course newCourse = CourseFactory.build(
                course.getCourseCode(),
                course.getCourseName());
        return service.create(newCourse);
    }
    @GetMapping("/getall")
    public Set<Course> getAll() { return service.getAll();}
}
