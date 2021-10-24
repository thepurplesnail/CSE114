//Check if a user entered string is a valid URL (http://www.cs.stonybrook.edu or https:://google.com)

import java.util.Scanner;
public class URL {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter URl: ");
      String url = input.next;
      String protocol = "( (http(s)?|ftp):{1,2}// )?";  
      String domain = "(www)?[\\S]+.(com|net|org|edu)/*";  
      String path = "([\\S]+)?";
      boolean isValid = url.matches(protocol + domain + path);
      if (isValid){
        System.out.println("Valid URL");
      } else {
          System.out.println("Invalid URL");
      }
    }
}
