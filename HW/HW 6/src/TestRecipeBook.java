import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        //initializing recipe and adding ingredients

        CookingRecipe recipe = new CookingRecipe("soup");
        recipe.addOrUpdateRecipeIngredient(new Ingredient("salt","oz",0), 3);
        recipe.addOrUpdateRecipeIngredient(new Ingredient("pepper","oz",4),3);
        recipe.addOrUpdateRecipeIngredient(new Ingredient("pepper","oz",4),3);
        recipe.addOrUpdateRecipeIngredient(new Ingredient("oregano","oz",4),3);
        System.out.println("Initializing recipe and adding ingredients");
        System.out.print(recipe.toString());
        System.out.println("Total calories: " + recipe.calculateCalories());
        System.out.println("Total ingredients: " + recipe.getNumberOfIngredients());

        //getting and removing ingredients
        System.out.println();
        System.out.println("Getting and removing ingredients");
        System.out.println("ingredient: " + recipe.getRecipeIngredient(new Ingredient("salt","oz",0)).getName());
        System.out.println("ingredient: " + recipe.getRecipeIngredient("coriander").getName());
        System.out.println("Took out: " + recipe.removeRecipeIngredient(new Ingredient("pepper","oz",4)).getName());
        System.out.println("Took out: " + recipe.removeRecipeIngredient("oregano").getName());

        System.out.println();
        System.out.println(recipe.toString());



        //initializing recipeBook and adding recipes
        System.out.println("Initializing recipeBook and adding/removing recipes");
        RecipeBook recipeBook = new RecipeBook("cookbook");
        RecipeIngredient[] ingredients1 = new RecipeIngredient[]{
                new RecipeIngredient("lettuce","lb",0,3),
                new RecipeIngredient("tomatoes","lb",2,4)
        };
        RecipeIngredient[] ingredients2 = new RecipeIngredient[]{
                new RecipeIngredient("flour","lb",80,3),
                new RecipeIngredient("apples","lb",55,4)
        };
        RecipeIngredient[] ingredients3 = new RecipeIngredient[]{
                new RecipeIngredient("lettuce","lb",0,3),
                new RecipeIngredient("tomatoes","lb",2,4),
                new RecipeIngredient("chicken","lb",32,4),
        };

        RecipeIngredient[] ingredients4 = new RecipeIngredient[]{
                new RecipeIngredient("lettuce","lb",0,3),
                new RecipeIngredient("tomatoes","lb",2,4),
                new RecipeIngredient("eggs","lb",32,4),
        };


        recipeBook.addRecipe("salad", ingredients1);
        recipeBook.addRecipe("pie", ingredients2);
        recipeBook.addRecipe("chicken salad", ingredients3);
        recipeBook.addRecipe("egg salad", ingredients4);
        System.out.println("recipe removed: " + recipeBook.removeRecipe("chicken salad").getName());
        System.out.println("recipe removed: " + recipeBook.removeRecipe("chicken salad").getName());
        System.out.println(recipeBook.toString());

        //find matching recipes
        System.out.println("Find matching recipes");
        CookingRecipe[] matches = recipeBook.findRecipes(ingredients1);
        System.out.print("Matches: ");
        printArr(matches);

        int n = 2;
        CookingRecipe[] recipeArr = recipeBook.findRecipesWithFewIngredients(n);
        System.out.print("Recipes with " + n + " or fewer ingredients: ");
        printArr(recipeArr);

        CookingRecipe[] minArr = recipeBook.findRecipesLowCalories();
        System.out.print("Recipes with lowest calories: ");
        printArr(minArr);

    }
    public static void printArr(CookingRecipe[] recipes){
        for (CookingRecipe recipe:recipes)
            System.out.print(recipe.getName() + "  ");
        System.out.println();
    }
}
