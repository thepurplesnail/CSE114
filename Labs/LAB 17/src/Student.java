public class Student{
    private const classStatus;
    public Student(){}
    public Student(const classStatus){
        this.classStatus = classStatus;
    }
    public String toString(){
        return
        super.toString() + "\n" + 
        "class status: " + classStatus;
    }
}
