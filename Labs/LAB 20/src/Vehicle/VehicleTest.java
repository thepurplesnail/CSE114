package Vehicle;

public class VehicleTest {
    public static void main(String[] args){
        MotorizedVehicle motorizedVehicle = new MotorizedVehicle("David",4,2.4);
        Bicycle bicycle = new Bicycle("Riley", 2);
        printVehicle(motorizedVehicle);
        System.out.println("Total HP: " + motorizedVehicle.calcHP());
        System.out.println();
        printVehicle(bicycle);

    }
    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}
