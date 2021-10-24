// Check if a user entered string is a valid US postal code.
import java.util.Scanner;
public class ZipCode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter US zip code: ");
        String zipCode = input.next();
        boolean isValid = zipCode.matches("[\\d]{5}(-[\\d]{4})?");
        if(isValid)
            System.out.println("Valid zip code");
        else
            System.out.println("Invalid zip code");
    }
}
