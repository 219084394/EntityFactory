package za.ac.cput.Factory;
/* Abdul Quddoos Sunge
 * 216118905
 */
import za.ac.cput.Entity.Registration;

public class RegistrationFactory {

    public static Registration build(String courseName,String courseCode,String studNumber, String regId){

        if(courseCode.isEmpty() || courseName.isEmpty() || studNumber.isEmpty() || regId.isEmpty())
            return null;

        return new Registration.RegistrationBuilder().setCourseName(courseCode)
                .setCourseCode(courseName).setStudNumber(studNumber).setRegId(regId).build();
    }


}