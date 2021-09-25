// Vanessa Man
// 112580649
import java.util.Scanner;
public class Numbers {
    public static void main (String[] args){
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean divByFAndS = false, divByFOrS = false, divByFOrSNotBoth= true;

        if ((num % 5 == 0) && (num % 6 == 0)){
            divByFAndS = true;
            divByFOrSNotBoth = false;
            divByFOrS = true;
        }
        else if (num % 5 == 0 || num % 6 == 0){
            divByFOrS = true;
        }

        System.out.println("Is "+ num + " divisible by 5 and 6? "+ divByFAndS);
        System.out.println("Is "+ num + " divisible by 5 or 6? "+ divByFOrS);
        System.out.println("Is "+ num + " divisible by 5 or 6, but not both? "+ divByFOrSNotBoth);
    }
}
