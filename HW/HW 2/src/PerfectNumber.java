// Vanessa Man
// 112580649
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int upperLimit, factorSum = 0, sum;
        System.out.print("Enter the upper limit: ");
        upperLimit = input.nextInt();
        System.out.print("The perfect numbers under " + upperLimit + " are: ");

        while (upperLimit > 0){
            sum = factorSum(upperLimit);
            if (sum == upperLimit){
                System.out.print(sum + " ");
            }
            upperLimit--;
        }

    }
    public static int factorSum(int num){
        int sum = 0;
        for (int i = num - 1; i > 0; i-- ){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
