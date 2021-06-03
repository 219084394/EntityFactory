package za.ac.cput.Entity;
/*Student.java
*Student Entity
* @author: Anicka Schouw 217284183
* June 2021
 */

public class Student {
    private int studentNo;
    private String stFname, stLname, stEmail;

    private Student (Builder builder){
    this.studentNo = builder.studentNo;
    this.stFname = builder.stFname;
    this.stLname = builder.stLname;
    this.stEmail = builder.stEmail;
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

    public static class Builder{
        private int studentNo;
        private String stFname, stLname, stEmail;

        public Builder setStudentNo(int studentNo) {
            this.studentNo = studentNo;
            return this;
        }

        public Builder setStFname(String stFname) {
            this.stFname = stFname;
            return this;
        }

        public Builder setStLname(String stLname) {
            this.stLname = stLname;
            return this;
        }

        public Builder setStEmail(String stEmail) {
            this.stEmail = stEmail;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

        public Builder copy (Student student){
            this.studentNo = student.studentNo;
            this.stFname = student.stFname;
            this.stLname = student.stLname;
            this.stEmail = student.stEmail;

            return this;
        }
    }
}
