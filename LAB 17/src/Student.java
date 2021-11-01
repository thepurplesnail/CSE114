public class Student extends Person{
    final static String freshman = "freshman";
    final static String sophomore = "sophomore";
    final static String junior = "junior";
    final static String senior = "senior";
    private String classStatus;
    public Student(){
    }
    public Student(String classStatus){
        this.classStatus = classStatus;
    }

    public String toString(){
        return super.toString();
    }
}
