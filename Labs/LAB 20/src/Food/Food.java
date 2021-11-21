package Food;

public abstract class Food {
    private String description;
    int caloriesPerServing;

    public Food(String description, int caloriesPerServing){
        this.description = description;
        this.caloriesPerServing = caloriesPerServing;
    }
    public abstract int calcCalories(int numServings);

    public String toString(){
        return getClass() +
                "\nDescription: " + description +
                "\nCalories per Serving: " + caloriesPerServing;
    }
}
