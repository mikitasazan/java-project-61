package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void run(Scanner scanner) {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Random random = new Random();
        Engine.play(
                scanner,
                description,
                () -> {
                    int number = random.nextInt(100) + 1;
                    String correctAnswer = isPrime(number) ? "yes" : "no";
                    return new String[] {String.valueOf(number), correctAnswer};
                });
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
