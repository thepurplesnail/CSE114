package Food;

public class Fruit extends Food{
    private String season;
    public Fruit(String description, int caloriesPerServing, String season){
        super(description, caloriesPerServing);
        this.season = season;
    }
    public int calcCalories(int numServings){
        return numServings * caloriesPerServing;
    }
    public String toString(){
        return super.toString() +
                "\nSeason: " + season;
    }
}
