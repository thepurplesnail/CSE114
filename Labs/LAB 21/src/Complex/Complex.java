package Complex;

public class Complex extends Number implements Comparable, Cloneable{
    private double a, b;
    public Complex(){
    }
    public Complex(double a){
        this.a = a;
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex complex){
        Complex sum = new Complex();
        sum.a = this.a + complex.a;
        sum.b = this.b + complex.b;
        return sum;
    }

    public Complex subtract(Complex complex){
        Complex difference = new Complex();
        difference.a = this.a - complex.a;
        difference.b = this.b - complex.b;
        return difference;
    }

    public Complex multiply(Complex complex){
        Complex product = new Complex();
        product.a = this.a * complex.a - this.b * complex.b;
        product.b = this.b * complex.a + this.a * complex.b;
        return product;
    }

    public Complex divide (Complex complex){
        Complex quotient = new Complex();
        quotient.a = (this.a * complex.a + this.b * complex.b)/(Math.pow(complex.a,2) + Math.pow(complex.b,2));
        quotient.b = (this.b * complex.a - this.a * complex.b)/(Math.pow(complex.a,2) + Math.pow(complex.b,2));
        return quotient;
    }

    public double getRealPart(){
        return a;
    }

    public double getImaginaryPart(){
        return b;
    }

    public String toString(){
        return a + ( (b != 0) ? (" + " + b + "i" ) : "" );
    }

    @Override
    public int intValue() {
        return (int)a;
    }

    @Override
    public long longValue() {
        return (long)a;
    }

    @Override
    public float floatValue() {
        return (float)a;
    }

    @Override
    public double doubleValue() {
        return a;
    }

    @Override
    public int compareTo(Object o) {
        if (this.subtract((Complex)o).getRealPart() > 0) return 1;
        else if (this.subtract((Complex)o).getRealPart() < 0) return -1;
        else return 0;
    }

    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException ex){
            return null;
        }
    }
}
