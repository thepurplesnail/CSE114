import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextInt();
        System.out.println("Sum of digits entered: "+ sumDigits(n));
    }
    public static long sumDigits(long n){
        if (n < 10)
            return n;
        else
            return sumDigits(n / 10) + (n % 10);
    }
}