import java.util.Scanner;
public class Celsius2Fahrenheit {
    public static void main (String[] args){
        double celsius, fahrenheit;
        System.out.print("Enter a degree in celsius: ");
        Scanner input = new Scanner(System.in);
        celsius = input.nextInt();
        fahrenheit = celsius * 9.0/5 + 32;
        System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");

    }
}
