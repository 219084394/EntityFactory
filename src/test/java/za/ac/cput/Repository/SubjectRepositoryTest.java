package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class SubjectRepositoryTest {
    private static SubjectRepository repository = SubjectRepository.getRepository();
    private static Subject subject = SubjectFactory.createSubject("ADP","APPDEV","11:00","MONDAY");

    @Test
    void a_create(){
        Subject created = repository.create(subject);
        assertEquals(created.getSubjectCode(),subject.getSubjectCode());
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read(){
        Subject read = repository.read(subject.getSubjectCode());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        Subject updated = new Subject.SubjectBuilder().copy(subject).setSubjectName("Info Systems").build();
        assertNotNull(repository.update(updated));
        //assert equals will fail showing that the update was a success.
        //assertEquals("Before update: "+subject,"After update: "+updated);
        System.out.println("Updated: "+updated);
    }

    @Test
    void e_delete(){
        boolean deleted = repository.delete(subject.getSubjectCode());
        assertTrue(deleted);
        System.out.println("Deleted: "+deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}