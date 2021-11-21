package Vehicle;

public abstract class Vehicle {
    private String ownerName;
    private int numWheels;
    public Vehicle(){}

    public Vehicle(String ownerName, int numWheels){
        this.ownerName = ownerName;
        this.numWheels = numWheels;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getNumWheels(){
        return numWheels;
    }

    public String toString(){
        return getClass() + "\n" +
                "owner name: " + ownerName + "\n" +
                "number of wheels: " + numWheels + "\n";
    }
}
