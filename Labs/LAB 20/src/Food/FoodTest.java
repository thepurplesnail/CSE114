package Food;

public class FoodTest {
    public static void main(String[] args){
        Food soup = new LiquidFood("soup", 12, 1.003);
        Food fruit = new Fruit("apple", 5, "spring");
        int numServings1 = 2, numServings2 = 1;
        int soupCal = soup.calcCalories(numServings1);
        int fruitCal = fruit.calcCalories(numServings2);
        printFood(soup);
        System.out.println("Number of calories in " + numServings1 + " serving(s): " + soupCal);
        System.out.println();
        printFood(fruit);
        System.out.println("Number of calories in " + numServings2 + " serving(s): " + fruitCal);
    }
    public static void printFood(Food food){
        System.out.println(food.toString());
    }
}
