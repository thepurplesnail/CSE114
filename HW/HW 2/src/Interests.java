// Vanessa Man
// 112580649
import java.util.Scanner;
public class Interests {
    public static void main(String[] args){

        double annualInterestRate = 5, monthlyRate, totalPayment, monthlyPayment, loanAmount, numberOfYears;

        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        loanAmount = input.nextInt();
        System.out.print("Number of years: ");
        numberOfYears = input.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        while (annualInterestRate <= 8){

            monthlyRate = annualInterestRate / 1200;
            monthlyPayment = loanAmount * monthlyRate / (1 - (Math.pow(1 / (1 + monthlyRate), numberOfYears * 12)));
            totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("\n%.3f %18.3f %19.2f", annualInterestRate,monthlyPayment,totalPayment);
            annualInterestRate = annualInterestRate + 1.0/8.0;
        }

    }
}
