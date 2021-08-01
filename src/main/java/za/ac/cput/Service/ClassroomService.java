package za.ac.cput.Service;

import za.ac.cput.Entity.Classroom;
import za.ac.cput.Repository.ClassroomRepository;

import java.util.Set;

public class ClassroomService implements IClassroomService {
    private static ClassroomService service = null;
    private ClassroomRepository repository = null;

    private ClassroomService(){
        this.repository = ClassroomRepository.getRepository();
    }

    public static ClassroomService getService(){
        if (service == null){
            service = new ClassroomService();
        }
        return service;
    }

    @Override
    public Classroom create(Classroom classroom) {
        return this.repository.create(classroom);
    }

    @Override
    public Classroom read(String classCode) {
        return this.repository.read(classCode);
    }

    @Override
    public Classroom update(Classroom classroom) {
        return this.repository.update(classroom);
    }

    @Override
    public boolean delete(String classCode) {
        return this.repository.delete(classCode);
    }

    @Override
    public Set<Classroom> getAll() {
        return this.repository.getAll();
    }

}
