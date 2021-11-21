package Complex;
import java.util.Scanner;
public class ComplexTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first complex number: ");
        String input1 = input.nextLine();
        System.out.println("Enter second complex number: ");
        String input2 = input.nextLine();

        Complex complex1 = convertInput(input1),
                complex2 = convertInput(input2);

        Complex complex3 = complex1.add(complex2),
                complex4 = complex1.subtract(complex2),
                complex5 = complex1.multiply(complex2),
                complex6 = complex1.divide(complex2);

        System.out.println(complex1 + "  +  " + complex2 + " = " + complex3);
        System.out.println(complex1 + "  -  " + complex2 + " = " + complex4);
        System.out.println(complex1 + "  x  " + complex2 + " = " + complex5);
        System.out.println(complex1 + "  /  " + complex2 + " = " + complex6);
    }

    public static Complex convertInput(String input){
        String[] inputArr = input.split(" ");

        String[] imaginaryArr = inputArr[2].split("");
        String imaginaryPart = "";
        for (String a:imaginaryArr){
            if (!a.equals("i"))
                imaginaryPart += a;
        }
        double real = Double.parseDouble(inputArr[0]);
        double imaginary = Double.parseDouble(imaginaryPart);
        return new Complex(real, imaginary);
    }
}
