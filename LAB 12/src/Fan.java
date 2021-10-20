public class Fan {
    static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private double radius;
    private String color;
    private boolean isOn;

    public Fan(){
        this(SLOW,5.0,"blue",false);
    }

    public Fan(int speed, double radius, String color, boolean isOn){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.isOn = isOn;
    }
    // accessors
    public int getSpeed(){ return this.speed; }

    public double getRadius(){ return this.radius; }

    public String getColor(){ return this.color; }

    public boolean getIsOn(){ return this.isOn; }

    // mutators

    public void setSpeed(int newSpeed){ this.speed = newSpeed; }

    public void setRadius(double newRadius){ this.radius = newRadius; }

    public void setColor(String color){ this.color = color; }

    public void setIsOn(boolean newIsOn){ this.isOn = newIsOn; }

    // display classes

    public String toString(){
        if (this.isOn){
            return "speed: " + this.speed +
                    "\ncolor: " + this.color +
                    "\nradius: " + this.radius;
        } else {
            return "fan is off" +
                    "\ncolor: " + this.color +
                    "\nradius: " + this.radius;
        }
    }
}
