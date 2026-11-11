import java.util.Scanner;

/**
 * Exercise 8 — QuizGame
 *
 * Ask the user 3 questions, store their answers, then print
 * a summary of everything they said.
 *
 * NOTE: You cannot score it yet — that needs if statements,
 * which arrive in Unit 3. For now just collect and echo.
 *
 * Make the questions about something you care about.
 */
public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your gamer tag? ");
        String tag = input.nextLine();
        System.out.print("What snack are you bringing to the tournament? ");
        String snack = input.nextLine();
        System.out.print("What is your secret power? ");
        String power = input.nextLine();

        System.out.println("Player profile:");
        System.out.println("Tag: " + tag);
        System.out.println("Snack: " + snack);
        System.out.println("Secret power: " + power);

        input.close();
    }
}
