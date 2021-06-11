package za.ac.cput.Entity;
/*Student.java
*Student Entity
* @author: Anicka Schouw 217284183
* June 2021
 */

public class Student {
    private int studentNo;
    private String stFname, stLname, stEmail;

    private Student (StudentBuilder builder){
    this.studentNo = builder.studentNo;
    this.stFname = builder.stFname;
    this.stLname = builder.stLname;
    this.stEmail = builder.stEmail;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getStFname() {
        return stFname;
    }

    public String getStLname() {
        return stLname;
    }

    public String getStEmail() {
        return stEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", stFname='" + stFname + '\'' +
                ", stLname='" + stLname + '\'' +
                ", stEmail='" + stEmail + '\'' +
                '}';
    }

    public static class StudentBuilder{
        private int studentNo;
        private String stFname, stLname, stEmail;

        public StudentBuilder setStudentNo(int studentNo) {
            this.studentNo = studentNo;
            return this;
        }

        public StudentBuilder setStFname(String stFname) {
            this.stFname = stFname;
            return this;
        }

        public StudentBuilder setStLname(String stLname) {
            this.stLname = stLname;
            return this;
        }

        public StudentBuilder setStEmail(String stEmail) {
            this.stEmail = stEmail;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

        public StudentBuilder copy (Student student){
            this.studentNo = student.studentNo;
            this.stFname = student.stFname;
            this.stLname = student.stLname;
            this.stEmail = student.stEmail;

            return this;
        }
    }
}
