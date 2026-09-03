package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int LENGTH = 10;

    public static void run(Scanner scanner) {
        String description = "What number is missing in the progression?";
        Random random = new Random();
        Engine.play(
                scanner,
                description,
                () -> {
                    int start = random.nextInt(20) + 1;
                    int step = random.nextInt(10) + 1;
                    int hiddenIndex = random.nextInt(LENGTH);
                    int[] numbers = new int[LENGTH];
                    for (int i = 0; i < LENGTH; i++) {
                        numbers[i] = start + i * step;
                    }
                    int hiddenValue = numbers[hiddenIndex];
                    StringBuilder question = new StringBuilder();
                    for (int i = 0; i < LENGTH; i++) {
                        if (i > 0) {
                            question.append(" ");
                        }
                        question.append(i == hiddenIndex ? ".." : String.valueOf(numbers[i]));
                    }
                    return new String[] {question.toString(), String.valueOf(hiddenValue)};
                });
    }
}
