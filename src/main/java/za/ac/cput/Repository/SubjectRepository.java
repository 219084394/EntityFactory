package za.ac.cput.Repository;

import za.ac.cput.Entity.Subject;

import java.util.HashSet;
import java.util.Set;

public class SubjectRepository implements ISubjectRepository{
    private static SubjectRepository repository = null;
    private Set<Subject> subjectDB = null;

    public SubjectRepository(){

        subjectDB = new HashSet<Subject>();
    }

    public static SubjectRepository getRepository(){
        if (repository == null){
            repository = new SubjectRepository();
        }
        return repository;
    }

    @Override
    public Subject create(Subject subject) {
        boolean created = subjectDB.add(subject);
        if(!created)
            return null;
        return subject;
    }

    @Override
    public Subject read(String subCode) {
        for (Subject s : subjectDB)
            if (s.getSubjectCode().equals(subCode)){
                return s;
            }
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        Subject pastSubject = read(subject.getSubjectCode());
        if (pastSubject != null){
            subjectDB.remove(pastSubject);
            subjectDB.add(subject);
            return subject;
        }
        return null;
    }

    @Override
    public boolean delete(String subCode) {
        Subject subjectToDelete = read(subCode);
        if (subjectToDelete == null)
            return false;
        subjectDB.remove(subjectToDelete);
        return true;
    }

    @Override
    public Set<Subject> getAll() {

        return subjectDB;
    }
}
