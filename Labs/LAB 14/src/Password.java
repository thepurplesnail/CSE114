//Check if a user entered string is a valid password: contains number, lower and upper case characters
// and a special character, with a length of at least 8 chars.
import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.next();
        String[] passwordArr = password.split("");
        boolean hasDigits = false, hasLowerCase = false, hasUpperCase = false, hasSpecialChar = false;
        for (String a:passwordArr){
            if(a.matches("[\\d]+"))
                hasDigits = true;
            if(a.matches("[a-z]+"))
                hasLowerCase = true;
            if(a.matches("[A-Z]+"))
                hasUpperCase = true;
            if(a.matches("[\\W]+"))
                hasSpecialChar = true;
        }
        boolean atLeast8Char = password.matches(".{8,}");
        if (hasDigits && hasLowerCase && hasUpperCase && hasSpecialChar && atLeast8Char)
            System.out.println("Valid password");
        else
            System.out.println("Invalid password");
    }
}