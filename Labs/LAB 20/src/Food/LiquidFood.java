package Food;

public class LiquidFood extends Food{
    private double viscosity;
    public LiquidFood(String description, int caloriesPerServing, double viscosity){
        super(description, caloriesPerServing);
        this.viscosity = viscosity;
    }
    public int calcCalories(int numServings){
        return numServings * caloriesPerServing;
    }
    public String toString(){
        return super.toString() +
                "\nViscosity: " + viscosity;
    }
}
