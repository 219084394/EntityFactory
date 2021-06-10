package za.ac.cput.Factory;

import za.ac.cput.Entity.Classroom;

public class ClassroomFactory {

    public static Classroom build(String classCode){
        return new Classroom.ClassBuilder().setClassCode(classCode).build();

    }
}
