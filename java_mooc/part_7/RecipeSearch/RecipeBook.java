import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void getRecipeBook() {
        System.out.println("Recipes: ");
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
}
