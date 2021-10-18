class Rectangle {
    private double width = 1, height = 1;
    private String color = "white";

    /*
    public Rectangle(double specWidth, double specHeight) {
        width = specWidth;
        height = specHeight;
    }
     */

    public Rectangle() {
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString(){
        return "Width: " + getWidth() + "\n" +
                "Height: " + getHeight() + "\n"+
                "Perimeter: " + getPerimeter() + "\n" +
                "Area: " + getArea() + "\n" +
                "Color: " + getColor();
    }




}
