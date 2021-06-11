package za.ac.cput.Entity;

/* Abdul Quddoos Sunge
 * 216118905
 */
public class Registration{
    private String courseCode;
    private String courseName;
    private String studNumber;
    private String regId;


    public Registration(RegistrationBuilder builder) {
        this.courseCode = builder.courseCode;
        this.courseName = builder.courseName;
        this.studNumber = builder.studNumber;
        this.regId = builder.regId;

    }

    public Registration() {

    }

    public String getCourseCode () {
        return courseCode;
    }

    public String getCourseName () {
        return courseName;
    }

    public String getStudNumber () {
        return studNumber;
    }

    public String getRegId () {
        return regId;
    }

    @Override
    public String toString () {
        return "Registration{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", studNumber='" + studNumber + '\'' +
                ", regId='" + regId + '\'' +
                '}';
    }

    public static class RegistrationBuilder {
        private String courseName;
        private String courseCode;
        private String studNumber;
        private String regId;

        public RegistrationBuilder setCourseCode(String courseCode) {
            this.courseCode = courseCode; return this;
        }
        public RegistrationBuilder setCourseName(String courseName) {
            this.courseName = courseName; return this;
        }
        public RegistrationBuilder setStudNumber(String studNumber) {
            this.studNumber = studNumber; return this;
        }
        public RegistrationBuilder setRegId(String regId) {
            this.regId = regId; return this;
        }

        public Registration build() {
            return new Registration(this); }
    }
}
