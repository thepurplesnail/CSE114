import java.util.Date;
public class Faculty extends Employee{
    private int officeHours, rank;
    public Faculty(){

    }
    public Faculty(int officeHours, int rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public int salaryRange(){
        int currentYear = new java.util.Date().getYear() + 1900;
        int years = currentYear - super.getDateHired().getYear();
        int n = 0;
        if (years * rank < 10)
            n = 1;
        else if (years * rank >= 10 && years * rank < 20)
            n = 2;
        else if (years * rank >= 20)
            n = 3;
        return n;
    }
    public String toString(){
        return super.toString();
    }

}
