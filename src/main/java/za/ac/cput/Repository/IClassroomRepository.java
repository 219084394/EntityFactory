package za.ac.cput.Repository;

import za.ac.cput.Entity.Classroom;
import za.ac.cput.Entity.Subject;

import java.util.Set;

public interface IClassroomRepository extends IRepository<Classroom, String> {
    public Set<Classroom> getAll();
}
