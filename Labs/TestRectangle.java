
public class TestRectangle {
	public static void main(String[] ars) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("rectangle1: ");
		System.out.println("\twidth: " + rectangle1.width);
		System.out.println("\theight: " + rectangle1.height);
		System.out.println("\tarea: " + rectangle1.getArea());
		System.out.println("\tperimeter: " + rectangle1.getPerimeter());
		
		System.out.println("rectangle2: ");
		System.out.println("\twidth: " + rectangle2.width);
		System.out.println("\thieght: " + rectangle2.height);
		System.out.println("\tarea: " + rectangle2.getArea());
		System.out.println("\tperimeter: " + rectangle2.getPerimeter());
	}
}
