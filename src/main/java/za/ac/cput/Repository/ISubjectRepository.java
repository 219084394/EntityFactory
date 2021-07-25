package za.ac.cput.Repository;

import za.ac.cput.Entity.Subject;

import java.util.Set;

public interface ISubjectRepository extends IRepository<Subject, String> {
    public Set<Subject> getAll();
}
