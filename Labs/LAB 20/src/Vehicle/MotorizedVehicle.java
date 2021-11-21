package Vehicle;

public class MotorizedVehicle extends Vehicle {
    private double engineVolumeDisplacement;
    public MotorizedVehicle(){}
    public MotorizedVehicle(String ownerName, int numWheels, double engineVolumeDisplacement){
        super(ownerName, numWheels);
        this.engineVolumeDisplacement = engineVolumeDisplacement;
    }
    public double calcHP(){
        return engineVolumeDisplacement * getNumWheels();
    }
    public String toString(){
        return super.toString() +
                "engine volume displacement: " + engineVolumeDisplacement;
    }
}
