package za.ac.cput.Factory;
/* Liam Stewart
 * 219084394
 * Group 21
 */
import za.ac.cput.Entity.Classroom;

public class ClassroomFactory {

    public static Classroom build(String classCode){
        return new Classroom.ClassBuilder().setClassCode(classCode).build();

    }
}
