package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void run(Scanner scanner) {
        String description = "What is the result of the expression?";
        Random random = new Random();
        Engine.play(
                scanner,
                description,
                () -> {
                    int first = random.nextInt(100);
                    int second = random.nextInt(100);
                    String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];
                    int result =
                            switch (operation) {
                                case "+" -> first + second;
                                case "-" -> first - second;
                                default -> first * second;
                            };
                    String question = first + " " + operation + " " + second;
                    return new String[] {question, String.valueOf(result)};
                });
    }
}
