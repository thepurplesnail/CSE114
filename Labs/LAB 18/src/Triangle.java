public class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) throws IllegalTriangleException{
        setTriangle(a, b, c);
    }
    public void setTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b > c && a + c > b && b + c > a){
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalTriangleException("Sum of any two sides must be greater than the other side");
        }
    }
    public static void main(String[] args){
        try{
            new Triangle(1,1,5);
        } catch (IllegalTriangleException ex){
            System.out.println(ex);
        }
    }
}
