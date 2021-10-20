class Circle2D {
    private double x, y, radius;
    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    public Circle2D(double newX, double newY, double newRadius){
        this.x = newX;
        this.y = newY;
        this.radius = newRadius;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public boolean contains(double x, double y){
        boolean isInCircle = false;
        double lengthFromCenter = getDistance(x,this.x, y, this.y);
        if (lengthFromCenter <= this.radius)
            isInCircle = true;
        return isInCircle;
    }

    public double getDistance(double x1, double x2, double y1, double y2){
        double a = x1 - x2;
        double b = y1 - y2;
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public boolean contains(Circle2D circle){
        boolean isInCircle = false;
        if (circle.radius <= this.radius){
            double centerDistance = getDistance(circle.x, this.x, circle.y, this.y);
            if (this.radius >= (circle.radius + centerDistance))
                isInCircle = true;
            }
        return isInCircle;
    }

    public boolean overlaps(Circle2D circle){
        boolean overlap = false;
        double centerDistance = getDistance(circle.x, this.x, circle.y, this.y);
        if (centerDistance < (circle.radius + this.radius))
            overlap = true;
        return overlap;
    }

    public String showProperties(){
        return "Center: (" + getX() + ", " + getY() + ") \n" +
                "Radius: " + getRadius() + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter() + "\n";
    }
}
