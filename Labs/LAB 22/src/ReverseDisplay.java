import java.util.Scanner;
public class ReverseDisplay {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.print("Input reversed: ");
        reverseDisplay(n);
    }
    public static void reverseDisplay(int value){
        if (value > 0){
            System.out.print(value % 10);
            reverseDisplay(value/10);
        }
    }
}
