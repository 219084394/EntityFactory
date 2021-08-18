package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Repository.ClassroomRepository;
import za.ac.cput.Repository.SubjectRepository;

import java.util.Set;
@Service
public class SubjectService implements ISubjectService{
    private static SubjectService service = null;
    private SubjectRepository repository = null;

    private SubjectService(){
        this.repository = SubjectRepository.getRepository();
    }

    public static SubjectService getService(){
        if (service == null){
            service = new SubjectService();
        }
        return service;
    }


    @Override
    public Subject create(Subject subject) {
        return this.repository.create(subject);
    }

    @Override
    public Subject read(String subCode) {
        return this.repository.read(subCode);
    }

    @Override
    public Subject update(Subject subject) {
        return this.repository.update(subject);
    }

    @Override
    public boolean delete(String subCode) {
        return this.repository.delete(subCode);
    }

    @Override
    public Set<Subject> getAll() {
        return this.repository.getAll();
    }
}
