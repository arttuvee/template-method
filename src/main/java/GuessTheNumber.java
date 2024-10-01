import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber extends Game {
    private int targetNumber;
    private int attempts;
    private boolean guessedCorrectly;

    @Override
    public void initializeGame(int numberOfPlayers) {
        targetNumber = new Random().nextInt(100) + 1;
        attempts = 0;
        guessedCorrectly = false;
        System.out.println("Guess the Number Game initialized for " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        return guessedCorrectly || attempts >= 10;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + (player + 1) + ", make your guess (between 1 and 100): ");
        int guess = scanner.nextInt();
        attempts++;

        if (guess == targetNumber) {
            System.out.println("Player " + (player + 1) + " guessed correctly!");
            guessedCorrectly = true;
        } else if (guess < targetNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }

    @Override
    public void displayWinner() {
        if (guessedCorrectly) {
            System.out.println("Congratulations! The winner guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Game over! No one guessed the number. The correct number was " + targetNumber);
        }
    }
}
