package za.ac.cput.Entity;
/* Liam Stewart
 * 219084394
 * Group 21
 */

public class Classroom {
    private String classCode;

    private Classroom(ClassBuilder builder){

        this.classCode = builder.classCode;
    }

    public String getClassCode() {
        return classCode;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classCode='" + classCode + '\'' +
                '}';
    }

    public static class ClassBuilder{
        private String classCode;

        public ClassBuilder setClassCode(String classCode){
            this.classCode = classCode;
            return this;
        }

        public Classroom build(){
            return new Classroom(this);
        }

    }


}
