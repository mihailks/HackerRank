package org.example.week_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CamelCase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            List<String> input = Arrays.stream(scanner.nextLine()
                            .split(";"))
                    .collect(Collectors.toList());

            if (input.get(0).equals("S")) {
                convertWords(input.get(1), input.get(2));
            } else if (input.get(0).equals("C")) {

            }
        }
    }

    private static void convertWords(String type, String words) {

    }

}
