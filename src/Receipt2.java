/**
 * Exercise 5 (Homework) — Receipt, version 2
 *
 * Rebuild your Session 4 receipt, but this time:
 *   - Every price is stored in a variable
 *   - Every quantity is stored in a variable
 *   - Line totals are CALCULATED (price * quantity)
 *   - The grand total is CALCULATED (sum of line totals)
 *   - Nothing numeric is typed directly into the output string
 *
 * ⚠️ Watch your parentheses. "Total: " + price * qty will
 *    NOT do what you want if you get it wrong.
 *
 * Challenge: add an 8.875% sales tax line, rounded to 2 decimals.
 */
public class Receipt2 {
    public static void main(String[] args) {
        double applePrice = 1.25;
        int appleQuantity = 3;
        double breadPrice = 2.50;
        int breadQuantity = 1;
        double milkPrice = 3.75;
        int milkQuantity = 2;

        double appleTotal = applePrice * appleQuantity;
        double breadTotal = breadPrice * breadQuantity;
        double milkTotal = milkPrice * milkQuantity;
        double subtotal = appleTotal + breadTotal + milkTotal;
        double tax = Math.round(subtotal * 0.08875 * 100) / 100.0;
        double total = subtotal + tax;

        System.out.println("Receipt");
        System.out.println("Apples: $" + applePrice + " x " + appleQuantity + " = $" + appleTotal);
        System.out.println("Bread: $" + breadPrice + " x " + breadQuantity + " = $" + breadTotal);
        System.out.println("Milk: $" + milkPrice + " x " + milkQuantity + " = $" + milkTotal);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales tax: $" + tax);
        System.out.println("Total: $" + total);

    }
}
