import java.util.*;
public class Calculator {
    public static void main (String args[]){
        try {
            double a = Double.parseDouble(args[0]);
            String op = args[1];
            double b = Double.parseDouble(args[2]);
            System.out.println(eval(a, b, op));
        } catch (NumberFormatException ex1){
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