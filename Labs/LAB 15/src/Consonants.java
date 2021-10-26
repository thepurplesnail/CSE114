//count the number of consonants in a string
import java.util.Scanner;
public class Consonants {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String myString = input.nextLine();

        String[] strArr = myString.split("");
        int count = 0;

        for (String el:strArr){
            if(el.matches("[^aeiouAEIOU]")){
                if(el.matches("[\\S]"))
                    count++;
            }
        }
        System.out.print("Number of consonants entered: " + count);
    }
}
