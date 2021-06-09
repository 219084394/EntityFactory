package za.ac.cput.Entity;

public class Course {
    private String courseCode;
    private String courseName;


    private Course (Builder builder){
        this.courseCode = builder.courseCode;
        this.courseName = builder.courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public static class Builder{
        private String courseCode;
        private String courseName;

        public Builder setCourseCode(String courseCode) {
            this.courseCode = courseCode;
            return this;
        }

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
        public Builder copy(Course course){
            this.courseCode = course.courseCode;
            this.courseName = course.courseName;

            return this;
        }
    }
}
