import java.util.Scanner;

/**
 * Project: Coffee Brewing Recipe Calculator
 * Builds a brewing recipe from a coffee name, grounds, and water, then
 * calculates the water-to-coffee ratio.
 */
public class ProjectPrototype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Coffee or bean name:");
        String coffeeName = input.nextLine();

        System.out.println("Coffee grounds (grams):");
        double coffeeGrams = input.nextDouble();

        System.out.println("Water (milliliters):");
        double waterMilliliters = input.nextDouble();

        double waterPerGram = waterMilliliters / coffeeGrams;

        System.out.println("\nCoffee Brewing Recipe");
        System.out.println("Coffee:\t\t" + coffeeName);
        System.out.println("Coffee grounds:\t" + coffeeGrams + " g");
        System.out.println("Water:\t\t" + waterMilliliters + " ml");
        System.out.println("Water-to-coffee ratio: 1:" + waterPerGram);

        input.close();
    }
}
