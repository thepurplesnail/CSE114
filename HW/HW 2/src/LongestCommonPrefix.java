// Vanessa Man
// 112580649
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();
        String longestCommonPrefix = "", shorterString, longerString;

        for(int i = 0; i < firstString.length(); i++){
            if(firstString.charAt(i) == secondString.charAt(i)){
                longestCommonPrefix += firstString.charAt(i);
            } else {
                System.out.println(firstString + " and " + secondString + " have no common prefix.");
                break;
            }
        }
        if (longestCommonPrefix.length() > 0){
            System.out.println("The common prefix is: " + longestCommonPrefix);
        }

    }
}
