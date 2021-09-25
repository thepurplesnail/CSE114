import java.util.Scanner;
public class ReversedString {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter here: ");
        String userString = input.next();
        String output = "", letter;
        for (int i = (userString.length() - 1) ; i >= 0; i--){
            output += userString.charAt(i);
        }
        System.out.println(output);
    }
}
