package za.ac.cput.Repository;

/*StudentRepository.java
 * Student Repository code
 * @author Anicka Schouw 217284183
 * July 2021
 */

import za.ac.cput.Entity.Student;
import java.util.HashSet;
import java.util.Set;

public class StudentRepository implements IStudentRepository {
    private static StudentRepository repository = null;
    private Set<Student> studentDB = null;

    private StudentRepository(){
        studentDB = new HashSet<Student>();
    }

    public static StudentRepository getRepository(){
        if (repository == null){
            repository = new StudentRepository();
        }
        return repository;
    }

    @Override
    public Student create(Student student){
        boolean created = studentDB.add(student);
        if(!created)
            return null;
        return student;
    }

    @Override
    public Student read(String name){
        for (Student st : studentDB)
            if (st.getStFname().equals(name)){
                return st;
            }
        return null;
    }

    @Override
    public Student update(Student student){
        Student oldSurname = read(student.getStLname());
        if (oldSurname != null) {
            studentDB.remove(oldSurname);
            studentDB.add(student);
            return student;
        }
        return null;
    }

    @Override
    public boolean delete(String name){
        Student nameToDelete = read(name);
        if (nameToDelete == null)
            return false;
        studentDB.remove(nameToDelete);
        return true;
    }

    @Override
    public Set<Student> getALL() {
        return studentDB;
    }
}

