package za.ac.cput.Entity;


import java.util.Locale;
/* Liam Stewart
 * 219084394
 * Group 21
 */

public class Subject {
    private String subjectCode;
    private String subjectName;
    private String time;
    private String date;

    //default constructor
    public Subject(){
    }

    private Subject(SubjectBuilder builder){
        this.subjectCode = builder.subjectCode;
        this.subjectName = builder.subjectName;
        this.time = builder.time;
        this.date = builder.date;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class SubjectBuilder{
        private String subjectCode;
        private String subjectName;
        private String time;
        private String date;

        public SubjectBuilder setSubjectCode(String subjectCode){
            this.subjectCode = subjectCode;
            return this;
        }

        public SubjectBuilder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public SubjectBuilder setTime(String time) {
            this.time = time;
            return this;
        }

        public SubjectBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }
    }
}
