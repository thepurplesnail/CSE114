public class TestCircle2D {
    public static void main(String[] args){
        Circle2D circle1 = new Circle2D(1,1,2);
        Circle2D circle2 = new Circle2D(2,2,2);

        System.out.println("Circle 1: \n" + circle1.showProperties());
        System.out.println("Circle 2: \n" + circle2.showProperties());

        System.out.println("Circle 2 contains Circle 1: " + circle2.contains(circle1));
        System.out.println("Circle 2 overlaps with Circle 1: " + circle2.overlaps(circle1));

        System.out.println("\n(2.31, 3.21) is in Circle 1: " + circle1.contains(2.31, 3.21));
        System.out.println("(2.31, 3.21) is in Circle 2: " + circle2.contains(2.31, 3.21));
    }
}
