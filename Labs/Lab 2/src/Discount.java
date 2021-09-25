import java.util.Scanner;
public class Discount {
    public static void main(String args[]) {
        int fixedPrice, quantity, discount;
        double discountedAmount, discountedPrice, totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fixed price: ");
        fixedPrice = input.nextInt();
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();
        if (quantity >= 10 && quantity < 20) {
            discount = 20;
        } else if (quantity >= 20 && quantity < 50) {
            discount = 30;
        } else if (quantity >= 50 && quantity < 100) {
            discount = 40;
        } else if (quantity >= 100) {
            discount = 50;
        } else {
            discount = 0;
        }
        discountedAmount = fixedPrice * discount * 0.01;
        discountedPrice = fixedPrice - discountedAmount;
        totalPrice = discountedPrice * quantity;

        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted price: $" + (fixedPrice - discountedAmount) + "0");
        System.out.println("Discounted amount per unit: $" + discountedAmount + "0");
        System.out.println("Total price: $" + totalPrice + "0");

    }
}