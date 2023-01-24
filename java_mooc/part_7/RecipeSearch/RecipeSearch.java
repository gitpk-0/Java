
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();

        System.out.println("File to read: ");
//        String file = "recipes.txt";
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            // Read recipes and create book of recipes
            int count = 0;
            String name = "";
            int cookTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            while (reader.hasNextLine()) {
                String row = reader.nextLine();

                if (count == 0) { // recipe name
                    name = row;
                }

                if (count == 1) { // recipe cookTime
                    cookTime = Integer.valueOf(row);
                }

                if ((count > 1) && (!(row.equals("")))) { // recipe ingredients
                    ingredients.add(row);
                }
                count++;

                if (row.equals("")) {
                    // create new recipe and add to recipeBook
                    Recipe recipe = new Recipe(name, cookTime, ingredients);
                    recipeBook.add(recipe);

                    // reset variables
                    count = 0;
                    name = "";
                    cookTime = 0;
                    ingredients = new ArrayList<>();
                }

            }

            System.out.println();
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println();
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            // commands sections
            if (command.equals("stop")) {
                break;
            }



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
