// Vanessa Man
// 112580649
import java.util.Scanner;
public class Temperature {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature between -58 Fahrenheit and 41 Fahrenheit");
        System.out.print(" and a wind speed greater than or equal to 2 then displays the wind-chill temperature: ");
        double t_a = input.nextDouble();
        double v = input.nextDouble();
        double t_wc = 35.74 + 0.6215 * t_a - 35.75 * Math.pow(v,.16) + 0.4275 * t_a * Math.pow(v,.16);
        System.out.println("Wind-chill temperature is " + t_wc);

    }
}
