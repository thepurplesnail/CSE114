import java.util.Scanner;
public class Conversions {
    public static void main (String args[]) {
        System.out.println("A - convert pounds to kilos");
        System.out.println("B - convert kilos to pounds");
        System.out.println("C - convert kilometers to miles");
        System.out.println("D - convert miles to kilometers");
        System.out.println("E - convert Celsius to Fahrenheit");
        System.out.println("F - convert Fahrenheit to Celsius");
        System.out.println("X - Exit");
        System.out.print("Enter your option: ");
        Scanner input = new Scanner(System.in);
        String conversion;
        double quantity;
        conversion = input.next();

        if (conversion.equals("A")) {
            System.out.print("Enter a quantity in pounds: ");
            quantity = input.nextDouble();
            System.out.print(quantity + " lb is " + poundsToKilos(quantity) + " kg");
        }

        else if (conversion.equals("B")) {
            System.out.print("Enter a quantity in kilograms: ");
            quantity = input.nextDouble();
            System.out.print(quantity + " kg is " + kilosToPounds(quantity) + " lb");
        }

        else if (conversion.equals("C")) {
            System.out.print("Enter a quantity in kilometers: ");
            quantity = input.nextDouble();
            System.out.print(quantity + " km is " + kmToMi(quantity) + " mi");
        }

        else if (conversion.equals("D")) {
            System.out.print("Enter a quantity in miles: ");
            quantity = input.nextDouble();
            System.out.print(quantity + " mi is " + miToKm(quantity) + " km");
        }

        else if (conversion.equals("E")) {
            System.out.print("Enter a quantity in Celsius: ");
            quantity = input.nextDouble();
            System.out.print(quantity + " deg C is " + celsiusToFahrenheit(quantity) + " deg F");
        }
        else if (conversion.equals("F")) {
            System.out.print("Enter a quantity in Fahrenheit: ");
            quantity = input.nextDouble();
            System.out.print(quantity + " deg F is " + fahrenheitToCelsius(quantity) + " deg C");
        }
    }
    public static double poundsToKilos(double pounds){
        double kilos;
        kilos = pounds / 2.205;
        return kilos;
    }

    public static double kilosToPounds(double kilos){
        double pounds;
        pounds = kilos * 2.205;
        return pounds;
    }

    public static double kmToMi(double km){
        double mi;
        mi = 1.609 * km;
        return mi;
    }

    public static double miToKm(double mi){
        double km;
        km = mi / 1.609;
        return km;
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius;
        celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
}

