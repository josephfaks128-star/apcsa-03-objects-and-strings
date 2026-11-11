import java.util.Scanner;

/**
 * Exercise 10 (Homework) — ProjectPrototype
 *
 * A first, tiny slice of YOUR year-long project.
 *
 * TODO:
 *   1. Ask the user for the 3 most important pieces of data
 *      your project needs (use the types you picked in
 *      Exercise 10 of assignment 01)
 *   2. Print them back in a nicely formatted summary
 *   3. Calculate and display ONE derived value from that data
 *      (a total, an average, a projection — whatever your
 *       project's core calculation is)
 *
 * This is not throwaway work. It goes straight into your M1
 * Proposal, due Session 12.
 *
 * Add a comment at the top saying what your project is.
 */
public class ProjectPrototype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // My project: Coffee Brewing Recipe Calculator
        // What it does: Builds a coffee recipe and calculates its water-to-coffee ratio.

        System.out.print("Coffee or bean name: ");
        String coffeeName = input.nextLine();

        System.out.print("Coffee grounds (grams): ");
        double coffeeGrams = input.nextDouble();

        System.out.print("Water (milliliters): ");
        double waterMilliliters = input.nextDouble();

        double waterPerGram = waterMilliliters / coffeeGrams;

        System.out.println("\nCoffee Brewing Recipe");
        System.out.println("Coffee: " + coffeeName);
        System.out.println("Coffee grounds: " + coffeeGrams + " g");
        System.out.println("Water: " + waterMilliliters + " ml");
        System.out.printf("Water-to-coffee ratio: 1:%.1f%n", waterPerGram);

        input.close();
    }
}
