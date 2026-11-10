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
        int badIdeas = days / 2;
        double totalGuard = guard * days;

        System.out.println(person + " waits " + days + " days between haircuts, "
                + "then says he uses " + guard + " guard, which is " + isLying + ".");
        System.out.println("The real number is " + realGuard + " guard, so his whole plan is basically ("
                + badIdeas + " bad ideas), and he still shows up with a " + haircut + " haircut.");
        System.out.println("If you add the fake amount, the math says he owes ("
                + totalGuard + " ridiculous dollars) for a haircut he never planned correctly.");
    }
}
