import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("How many players will be playing?");

        int numberOfPlayers = 0;
        while (numberOfPlayers < 1 || numberOfPlayers > 4) {
            System.out.print("Enter number of players (1-4): ");
            numberOfPlayers = scanner.nextInt();
        }

        // Create an instance of GuessTheNumber
        Game guessTheNumberGame = new GuessTheNumber();

        // Start the game with the chosen number of players
        guessTheNumberGame.play(numberOfPlayers);

        scanner.close();
    }
}
