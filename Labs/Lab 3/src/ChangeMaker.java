import java.util.Scanner;
public class ChangeMaker {
    public static void main(String[] args){
        int change, hundreds, fifties, twenties, tens, fives, singles, rem, ds, ns, qs, ps;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        change = (int) (input.nextDouble() * 100);
        hundreds = change / 10000;
        rem = change % 10000;

        fifties = rem / 5000;
        rem = rem % 5000;

        twenties = rem / 2000;
        rem = rem % 2000;

        tens = rem / 1000;
        rem = rem % 1000;

        fives = rem / 500;
        rem = rem % 500;

        singles = rem / 100;
        rem = rem % 100;

        qs = rem / 25;
        rem = rem % 25;

        ds = rem / 10;
        rem = rem % 10;

        ns = rem / 5;
        rem = rem % 5;

        ps = rem;

        if (hundreds != 0)
            System.out.println(hundreds + " x $100 bills");
        if (fifties != 0)
            System.out.println(fifties + " x $50 bills");
        if (twenties != 0)
            System.out.println(twenties + " x $20 bills");
        if (tens != 0)
            System.out.println(tens + " x $10 bills");
        if (fives != 0)
            System.out.println(fives + " x $5 bills");
        if (singles != 0)
            System.out.println(singles + " x $1 bills");
        if (qs != 0)
            System.out.println(qs + " x 25c coins");
        if (ds != 0)
            System.out.println(ds + " x 10c coins");
        if (ns != 0)
            System.out.println(ns + " x 5c coins");
        if (ps != 0)
            System.out.println(ps + " x 1c coins");
    }
}
