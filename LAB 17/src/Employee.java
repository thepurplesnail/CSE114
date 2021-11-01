public class Employee extends Person{
    private int salary;
    private MyDate dateHired;
    public Employee(){
    }
    public Employee(int salary, MyDate dateHired){
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public MyDate getDateHired(){
        return dateHired;
    }
    public String toString(){
        return super.toString();
    }
}
