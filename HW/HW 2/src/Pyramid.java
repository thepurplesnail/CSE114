// Vanessa Man
// 112580649
import java.util.Scanner;

public class Pyramid {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int numLines = input.nextInt();
        for (int i = 1; i <= numLines; i++){
            // spaces
            for (int n = 1; n <= numLines - i; n++){
                System.out.print("\t");
            }

            // ascending exp
            int pow = 1;
            for(int n = 0; n < i; n++){
                System.out.print(pow + "\t");
                pow *= 2;
            }

            // descending exp
            pow /= 4;
            for(int n = 1; n < i; n++){
                System.out.print(pow + "\t");
                pow /= 2;
            }
            System.out.println();
        }
    }
}
