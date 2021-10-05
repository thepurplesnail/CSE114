import java.util.Scanner;
public class GetTriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double[][] points = {{x1, y1}, {x2, y2}, {x3, y3}};
		double area = getTriangleArea(points);
		if (area > 0)
			System.out.printf("Area is: %.2f", area);
		else 
			System.out.print("The three points are on the same line.");
	}
	
	public static double getTriangleArea(double[][] points) {
		double x1 = points[0][0];
		double y1 = points[0][1];
		double x2 = points[1][0];
		double y2 = points[1][1];
		double x3 = points[2][0];
		double y3 = points[2][1];
		
		double a = dist(x1, y1, x2, y2);
		double b = dist(x2, y2, x3, y3);
		double c = dist(x3, y3, x1, y1);
		
		double Area = .25 * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
		return Area;
	}
	
	public static double dist(double x1, double y1, double x2, double y2) {
		double lx = Math.abs(x1 - x2);
		double ly = Math.abs(y1 - y2);
		double dist = Math.sqrt(lx * lx + ly * ly);
		return dist;
	}
}