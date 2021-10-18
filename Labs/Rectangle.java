class Rectangle {
	public double width = 1.0, height = 1.0;
	public String color = "white"; 
	
	public Rectangle() {
	}
	
	public Rectangle(double specWidth, double specHeight) {
		width = specWidth;
		height = specHeight;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
}
