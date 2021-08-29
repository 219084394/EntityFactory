package za.ac.cput.Service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Classroom;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.ClassroomFactory;
import za.ac.cput.Factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class SubjectServiceTest {
    private static SubjectService service = SubjectService.getService();
    private static Subject subject = SubjectFactory.createSubject("ADP","APPDEV","12:00","MONDAY");

    @Test
    void a_create(){
        Subject created = service.create(subject);
        assertEquals(created.getSubjectCode(),subject.getSubjectCode());
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read(){
        Subject read = service.read(subject.getSubjectCode());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        Subject updated = new Subject.SubjectBuilder().copy(subject).setSubjectName("Info Systems").build();
        //assert equals will fail showing that the update was a success.
        //assertEquals("Before update: "+subject,"After update: "+updated);
        assertNotNull(service.update(updated));
        System.out.println("Updated: "+updated);
    }

    @Test
    void e_delete(){
        boolean deleted = service.delete(subject.getSubjectCode());
        assertTrue(deleted);
        System.out.println("Deleted: "+deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(service.getAll());
    }
}