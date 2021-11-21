import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MeanAndSum {
    public static void main (String args[]) throws IOException{
        File test = new File("test.txt");
        Scanner input = new Scanner(test);
        int sum = 0, count = 0;
        double mean = 0;
        while (input.hasNext()){
            sum += input.nextInt();
            count++;
        }
        if (count == 0)
            mean = 0;
        else
            mean = (double) sum/count;

        System.out.println("Total: " + sum);
        System.out.println("Average: " + mean);
    }
}
