public class Staff extends Employee{
    private String title;
    public Staff(){

    }
    public Staff(String title){
        this.title = title;
    }
    public String toString(){
        return super.toString();
    }
}