package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void run(Scanner scanner) {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        Engine.play(
                scanner,
                description,
                () -> {
                    int number = random.nextInt(100) + 1;
                    String correctAnswer = number % 2 == 0 ? "yes" : "no";
                    return new String[] {String.valueOf(number), correctAnswer};
                });
    }
}
