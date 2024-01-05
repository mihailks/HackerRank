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
                splitWords(input.get(2));
            } else if (input.get(0).equals("C")) {
                combineWords(input.get(1), input.get(2));
            }
        }
    }

    private static void combineWords(String type, String words) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = words.split(" ");

        for (String s : arr) {
            String output = s.substring(0, 1).toUpperCase() + s.substring(1);
            stringBuilder.append(output);
        }

        if (type.equals("V") || type.equals("M")) {
            String temp = stringBuilder.toString();
            String output = temp.substring(0, 1).toLowerCase() + temp.substring(1);
            stringBuilder = new StringBuilder(output);
        }

        if (type.equals("M")) {
            stringBuilder.append("()");
        }
        System.out.println(stringBuilder);
    }

    private static void splitWords(String words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            if (i == 0) {
                stringBuilder.append(words.charAt(i));
                continue;
            }
            if (words.charAt(i) >= 65 && words.charAt(i) <= 90) {
                stringBuilder.append(" ");
            }
            if (words.charAt(i) == '(' || words.charAt(i) == ')') {
                continue;
            }

            stringBuilder.append(words.charAt(i));
        }

        System.out.println(stringBuilder.toString().toLowerCase());
    }

}
