package za.ac.cput.Factory;
/* Liam Stewart
 * 219084394
 * Group 21
 */
import za.ac.cput.Entity.Subject;

public class SubjectFactory {

    public static Subject createSubject(String subjectCode,String subjectName,String time, String date){

        /*if(subjectCode.isEmpty() || subjectName.isEmpty() || time.isEmpty() || date.isEmpty())
            return null;*/

        Subject subject = new Subject.SubjectBuilder().setSubjectCode(subjectCode)
                .setSubjectName(subjectName)
                .setTime(time)
                .setDate(date)
                .build();
        return subject;
    }



}

