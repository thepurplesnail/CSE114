//Check if a user entered string is a palindrome
import java.util.Scanner;
public class URL {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter palindrome: ");
      String myString = input.nextLine();
      String[] strArr = myString.split("");
      int count = 0;
      boolean isPalindrome = false;
      
      // count number of non-white space characters
      for (String el:strArr){  
          if(el.matches("[\\S]")){
              count++;
          }
      }
      
      // initialize and populate temp[] with all non-white space elements in strArr
      String[] temp = new String[count];
      for (int i = 0, j = 0; i < strArr.length; i++){
          if(strArr[i].matches("[\\S]")){
              temp[j++] = strArr[i]; 
          }
      }
      strArr = temp;
      
      // check if strArr is palindrome
      for (int i = 0, j = strArr.length - 1; i < strArr.length/2; i++, j--){
          if (strArr[i].equals(strArr[j])){
              isPalindrome = true;
          } else {
              isPalindrome = false;
              break;
          }
      }
      
      if (isPalindrome){
          System.out.println("This is a palindrome");
      } else {
          System.out.println("This is not a palindrome");
      }
    }
}
