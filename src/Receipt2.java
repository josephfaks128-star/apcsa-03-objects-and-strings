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

        double burgerPrice = 8.50;
        double friesPrice = 3.00;
        double sodaPrice = 2.00;

        int burgerQty = 2;
        int friesQty = 1;
        int sodaQty = 2;

        
        double burgerTotal = burgerPrice * burgerQty;
        double friesTotal = friesPrice * friesQty;
        double sodaTotal = sodaPrice * sodaQty;

    
        double subtotal = burgerTotal + friesTotal + sodaTotal;

        
        double taxRate = 0.08875;
        double tax = Math.round(subtotal * taxRate * 100.0) / 100.0;

        
        double grandTotal = subtotal + tax;

        
        System.out.println("===== RECEIPT =====");
        System.out.println("Burgers: $" + burgerTotal);
        System.out.println("Fries: $" + friesTotal);
        System.out.println("Soda: $" + sodaTotal);
        System.out.println("-------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Sales Tax: $" + tax);
        System.out.println("Grand Total: $" + grandTotal);

    }
}
