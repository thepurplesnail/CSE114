import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("Input reversed: " + reverse(n));
    }
    public static int reverse(int n){
        if (n < 10)
            return n;
        else
            return (n % 10) * (int) Math.pow(10, (getPow(n) - 1) ) + reverse(n / 10);
    }
    public static int getPow(int n){
        if (n < 10)
            return 1;
        else
            return 1 + getPow(n/10);
    }
}