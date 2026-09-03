package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void run(Scanner scanner) {
        String description = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        Engine.play(
                scanner,
                description,
                () -> {
                    int first = random.nextInt(100) + 1;
                    int second = random.nextInt(100) + 1;
                    String question = first + " " + second;
                    return new String[] {question, String.valueOf(gcd(first, second))};
                });
    }

    private static int gcd(int first, int second) {
        int a = first;
        int b = second;
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
