import java.util.Scanner;
public class ISBN {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter 9 digits: ");
        int serial, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, sum;
        serial = input.nextInt();

        d9 = serial % 10;
        serial = serial/10;

        d8 = serial % 10;
        serial = serial/10;

        d7 = serial % 10;
        serial = serial/10;

        d6 = serial % 10;
        serial = serial/10;

        d5 = serial % 10;
        serial = serial/10;

        d4 = serial % 10;
        serial = serial/10;

        d3 = serial % 10;
        serial = serial/10;

        d2 = serial % 10;
        serial = serial/10;

        d1 = serial % 10;
        serial = serial/10;

        sum = d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9;

        if (sum % 10 == 0){
            System.out.println("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            d10 = sum % 11;
            System.out.println("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }
    }
}
