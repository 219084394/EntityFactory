package za.ac.cput.Factory;

import za.ac.cput.Entity.Subject;

public class SubjectFactory {

    public static Subject build(String subjectCode,String subjectName,String time, String date){

        if(subjectCode.isEmpty() || subjectName.isEmpty() || time.isEmpty() || date.isEmpty())
            return null;

        return new Subject.SubjectBuilder().setSubjectCode(subjectCode)
                .setSubjectName(subjectName)
                .setTime(time)
                .setDate(date)
                .build();
    }

}

