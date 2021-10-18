public class TestRectangle {
    public static void main(String[] ars) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.setHeight(4);
        rectangle1.setWidth(40);
        rectangle2.setWidth(3.5);
        rectangle2.setWidth(35.9);

        rectangle1.setColor("red");
        rectangle2.setColor("red");

        System.out.println("Rectangle 1: \n" + rectangle1.toString() + "\n");
        System.out.println("Rectangle 2: \n" + rectangle2.toString());

    }
}
