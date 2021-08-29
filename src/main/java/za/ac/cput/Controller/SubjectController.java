package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.SubjectFactory;
import za.ac.cput.Service.SubjectService;

import java.util.Set;


@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    //@PostMapping("/create") another way of doing request mapping
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Subject create(@RequestBody Subject subject){
        Subject newSubject = SubjectFactory.createSubject(subject.getSubjectCode()
                ,subject.getSubjectName(),subject.getTime(),subject.getDate());
        return subjectService.create(newSubject);
    }
    @GetMapping("/read/")
    public Subject read(@RequestBody Subject subject){
        return subjectService.read(subject.getSubjectCode());
    }

    @PostMapping("/update")
    public Subject update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @PostMapping("/delete")
    public String delete(@RequestBody Subject subject){
        if (subjectService.delete(subject.getSubjectCode()))
            return "Successfully deleted";
        else
            return "Could not delete subject";
    }

    @GetMapping("/getall")
    public Set<Subject> getAll(){
        return subjectService.getAll();
    }
}
