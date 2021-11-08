import java.util.*;
public class Calculator {
    public static void main (String[] args){
        System.out.print("Enter an expression: ");
        Scanner input = new Scanner(System.in);
        try {
            double a = input.nextDouble();
            String op = input.next();
            double b = input.nextDouble();
            System.out.println(eval(a, b, op));
        } catch (InputMismatchException ex1){
            System.out.println(ex1);
        } catch (ArithmeticException ex2){
            System.out.println(ex2);
        }
    }

    public static double eval(double a, double b, String op) throws ArithmeticException{
        double result = 0;
        if (op.equals("+"))
            result = a + b;
        else if (op.equals("-"))
            result = a - b;
        else if (op.equals("/")){
            if (b == 0)
                throw new ArithmeticException("Division by zero is illegal");
            result = a / b;
        }
        return result;
    }
}