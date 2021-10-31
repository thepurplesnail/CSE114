
public class Triangle extends GeometricObject{
    private double side1, side2, side3;
    public Triangle(){
        this(1.0,1.0,1.0);
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public String toString(){
        return 
        super.toString() + "\n" + 
        "side1: " + side1 + "\n" +
        "side2: " + side2 + "\n" + 
        "side3: " + side3+ "\n" + 
        "area: " + getArea() + "\n" + 
        "perimeter: " + getPerimeter();
    }
    
    //tester 
    public static void main(String[] args) {
		GeometricObject triangle1 = new Triangle(1, 1.5, 1);
		triangle1.setColor("yellow");
		triangle1.setFilled(true);
        System.out.print(triangle1.toString());
	}
	
}

