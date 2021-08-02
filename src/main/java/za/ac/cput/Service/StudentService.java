package za.ac.cput.Service;
/*StudentService.java
*Class contains all Student Service code
* @author: Anicka Schouw 217284183
* August 2021
 */
import za.ac.cput.Entity.Student;
import za.ac.cput.Repository.StudentRepository;
import java.util.Set;

public class StudentService implements IStudentService {
    private static StudentService service = null;
    private StudentRepository repository = null;

    private StudentService(){
        this.repository = StudentRepository.getRepository();
    }

    public static StudentService getService(){
        if (service == null){
            service = new StudentService();
        }
        return service;
    }

    @Override
    public Student create(Student student){
        return this.repository.create(student);
    }

    @Override
    public Student read(String name){
        return this.repository.read(name);
    }

    @Override
    public Student update(Student student){
        return this.repository.update(student);
    }

    @Override
    public boolean delete(String name){
        return this.repository.delete(name);
    }

    @Override
    public Set<Student> getAll(){
        return this.repository.getALL();
    }

}
