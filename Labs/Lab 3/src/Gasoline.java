import java.util.Scanner;
public class Gasoline {
    public static void main (String[] args){
        double minutes, mph, mpg, gallons;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        minutes = input.nextDouble();
        System.out.print("Enter the constant speed of the car: ");
        mph = input.nextDouble();
        System.out.print("Enter the fuel efficiency of the car: ");
        mpg = input.nextDouble();

        gallons = (minutes/60.0) * mph / mpg;
        System.out.println("Total of " + gallons + " gallons consumed.");
    }
}
