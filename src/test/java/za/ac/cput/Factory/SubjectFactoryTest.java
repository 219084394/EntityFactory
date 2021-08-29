package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Subject;

import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {

    @Test
    void createSubject(){
        Subject subject = SubjectFactory.createSubject("ADP","APPDEV","12:00","MONDAY");
        System.out.println(subject);
    }

}