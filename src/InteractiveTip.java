import java.util.Scanner;

/**
 * Exercise 7 — InteractiveTip
 *
 * Your tip calculator from Session 7, but the user supplies
 * the bill, the tip percentage, and the number of people.
 *
 * Output the tip, the total, and each person's share,
 * all to 2 decimal places.
 */
public class InteractiveTip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bill: ");
        double bill = input.nextDouble();
        System.out.print("Tip percent: ");
        double tipPercent = input.nextDouble();
        System.out.print("Number of people: ");
        int people = input.nextInt();

        double tip = bill * tipPercent / 100;
        double total = bill + tip;
        double each = total / people;

        System.out.printf("Tip: $%.2f%nTotal: $%.2f%nEach: $%.2f%n", tip, total, each);

        input.close();
    }
}
