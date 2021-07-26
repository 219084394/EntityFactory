package za.ac.cput.Repository;

/*StudentRepository.java
 * IStudentRepository code
 * @author Anicka Schouw 217284183
 * July 2021
 */

import za.ac.cput.Entity.Student;
import java.util.Set;

public interface IStudentRepository extends IRepository <Student, String> {
    public Set<Student> getALL();
}
