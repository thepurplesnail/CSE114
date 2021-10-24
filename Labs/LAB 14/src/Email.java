// Check if a user entered string is a valid email address.
// recipient name with 1-64 non-whitespace characters + @ + domain name with no whitespace + com/net/org/edu domain
import java.util.Scanner;
public class Email {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String emailAddress = input.next();
        boolean isValid = emailAddress.matches("[\\S]{1,64}@[\\S]+.(com|net|org|edu)");
        if(isValid)
            System.out.println("Valid email address");
        else
            System.out.println("Invalid email address");
    }
}
