// Vanessa Man
// 112580649
import java.util.Scanner;
public class triangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double sideOne, sideTwo, sideThree;
        String output = "";
        System.out.print("Side 1: ");
        sideOne = (double) input.nextDouble();
        System.out.print("Side 2: ");
        sideTwo = (double) input.nextDouble();
        System.out.print("Side 3: ");
        sideThree = (double) input.nextDouble();
        if (sideOne + sideTwo < sideThree || sideOne + sideThree < sideTwo || sideTwo + sideThree < sideOne ) {
            output = "Invalid input!";
        } else {
            if (sideOne == sideTwo & sideOne == sideThree){
                output = "Equilateral";
            }
            else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree){
                output = "Isosceles";
            } else {
                output = "Scalene";
            }
        }
        System.out.println("Output: " + output);
    }
}
