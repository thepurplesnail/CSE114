import java.util.Scanner;
public class counting {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer, sum = 0, counter = 0, numPos = 0, numNeg = 0;
        float average = 0;
        integer = input.nextInt();
        while (integer != 0){
            System.out.print("Enter an integer: ");
            sum += integer;
            counter++;
            average = (float) sum/counter;
            if (integer < 0){
                numNeg++;
            } else {
                numPos++;
            }
            integer = input.nextInt();
        }
        System.out.println("Average is " + average);
        System.out.println("Total is " + sum);
        System.out.println("Number of positive entries is " + numPos);
        System.out.println("Number of negative entries is " + numNeg);
    }
}
