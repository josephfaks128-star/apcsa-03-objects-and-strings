import java.time.LocalDate;
import java.util.Scanner;

/**
 * Exercise 6 — PersonalGreeter
 *
 * Ask the user for their name, age, and favorite subject.
 * Respond with a paragraph that uses all three, plus the year
 * they will turn 100.
 *
 * ⚠️ Remember the trap: if you read an int and THEN a line,
 *    you need a bare input.nextLine() in between.
 */
public class PersonalGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("How old are you? ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What is your favorite subject? ");
        String subject = input.nextLine();

        int yearTurn100 = LocalDate.now().getYear() + (100 - age);
        System.out.println(name + " is " + age + " years old and loves " + subject + ". " + name + " will turn 100 in " + yearTurn100 + ".");

        input.close();
    }
}
