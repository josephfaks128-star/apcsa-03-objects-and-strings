/**
 * Exercise 1 — MadLibs
 *
 * Declare at least 6 variables of mixed types (int, double,
 * String, char, boolean), then concatenate them into a paragraph.
 *
 * Requirements:
 *   - At least one computed value printed inside parentheses,
 *     e.g. ... + (price * quantity) + ...
 *   - At least one char and one boolean in the output
 *   - The result should actually be funny. That's a requirement.
 */
public class MadLibs {
    public static void main(String[] args) {
        String person = "Mr. Al";
        int days = 180;
        double guard = 0.3;
        boolean isLying = true;
        char haircut = 'W';
        int realGuard = 1;
        int dramaticDelay = days / 2;

        System.out.println(person + " waits " + days + " days between haircuts, "
                + "then claims he uses " + guard + " guard, which is " + isLying + ".");
        System.out.println("The truth is he actually uses " + realGuard + " guard, "
                + "which makes his haircut plan look like (" + dramaticDelay + " bad ideas) "
                + "before he shows up with a " + haircut + " hairstyle.");
    }
}
