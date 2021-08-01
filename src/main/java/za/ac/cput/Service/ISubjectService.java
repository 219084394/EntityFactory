package za.ac.cput.Service;

import za.ac.cput.Entity.Classroom;
import za.ac.cput.Entity.Subject;

import java.util.Set;

public interface ISubjectService extends IService<Subject, String> {
    public Set<Subject> getAll();
}
