// Vanessa Man
// 112580649
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int lowerLimit, upperLimit, sum;
        System.out.print("Enter the lower limit: ");
        lowerLimit = input.nextInt();
        System.out.print("Enter the upper limit: ");
        upperLimit = input.nextInt();

        System.out.print("The Armstrong numbers between 10 and 1000 are: ");

        for (int i = lowerLimit; i <= upperLimit; i++){
            sum = powerSum(i);
            if(i == sum)
                System.out.print(sum + " ");
        }
    }
    public static int powerSum(int num){
        int sum = 0, dig;
        int numDigs = String.valueOf(num).length();
        for (int i = 0; i < numDigs; i++){
            dig = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            sum += Math.pow(dig, numDigs);
        }
        return sum;
    }
}
