package hexlet.code;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
    private static final int ROUNDS = 3;

    public static String greet(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void play(
            Scanner scanner, String description, Supplier<String[]> questionGenerator) {
        String name = greet(scanner);
        System.out.println(description);
        for (int round = 0; round < ROUNDS; round++) {
            String[] pair = questionGenerator.get();
            String question = pair[0];
            String correctAnswer = pair[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (!answer.equals(correctAnswer)) {
                System.out.println(
                        "'"
                                + answer
                                + "' is wrong answer ;(. Correct answer was '"
                                + correctAnswer
                                + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
