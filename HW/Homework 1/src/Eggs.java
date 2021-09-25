// Vanessa Man
// 112580649
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of eggs in the order: ");
        double total, dozensCost, singlesCost;
        int numDozens = 0;
        int numLoose = 0;
        int numEggs = input.nextInt();
        if (numEggs >= 12) {
            numDozens = numEggs / 12;
            dozensCost = numDozens * 3.25;
            numLoose = numEggs % 12;
            singlesCost = numLoose * .45;
            total = dozensCost + singlesCost;
        } else {
            numLoose = numEggs;
            total = numLoose * .45;
        }
        System.out.print("You ordered "+ numEggs + " eggs. That's " + numDozens + " dozen");
        System.out.print(" at $3.25 per dozen and " + numLoose + " loose eggs at 45 cents");
        System.out.print(" for a total of $"+ total);
    }
}