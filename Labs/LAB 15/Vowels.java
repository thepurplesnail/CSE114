//count the number of vowels in a string
import java.util.Scanner;
public class Vowels {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter string: ");
      String myString = input.nextLine();
      String[] strArr = myString.split("");
      int count = 0;
      for (String el:strArr){
          if(el.matches("([aeiou]|[AEIOU])")){
              count++;
          }
      }
      System.out.print("Number of vowels entered: " + count);
    }
}
