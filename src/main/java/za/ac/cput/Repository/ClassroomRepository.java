package za.ac.cput.Repository;

import za.ac.cput.Entity.Classroom;
import za.ac.cput.Entity.Subject;

import java.util.HashSet;
import java.util.Set;

public class ClassroomRepository implements IClassroomRepository{
    private static ClassroomRepository repository = null;
    private Set<Classroom>  classroomDB= null;

    public ClassroomRepository(){
        classroomDB = new HashSet<Classroom>();
    }

    public static ClassroomRepository getRepository(){
        if (repository == null){
            repository = new ClassroomRepository();
        }
        return repository;
    }

    @Override
    public Classroom create(Classroom classroom) {
        boolean created = classroomDB.add(classroom);
        if (!created)
            return null;
        return classroom;
    }

    @Override
    public Classroom read(String classCode) {
        for (Classroom c : classroomDB)
            if (c.getClassCode().equals(classCode)){
                return c;
            }
        return null;
    }

    @Override
    public Classroom update(Classroom classroom) {
        Classroom oldClass = read(classroom.getClassCode());
        if (oldClass != null){
            classroomDB.remove(oldClass);
            classroomDB.add(classroom);
            return classroom;
        }
        return null;
    }

    @Override
    public boolean delete(String classCode) {
        Classroom classToDelete = read(classCode);
        if(classToDelete == null)
        return false;
        classroomDB.remove(classToDelete);
        return true;
    }

    @Override
    public Set<Classroom> getAll() {
        return classroomDB;
    }

}
