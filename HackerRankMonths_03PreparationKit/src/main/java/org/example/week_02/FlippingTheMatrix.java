package org.example.week_02;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;


class Result0210_original {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = 0; j < matrix.size() / 2; j++) {
                sum +=
                        Math.max(matrix.get(i).get(j),
                        Math.max(matrix.get(i).get(matrix.size() - 1 - j),
                        Math.max(matrix.get(matrix.size() - 1 - i).get(j),
                        matrix.get(matrix.size() - 1 - i).get(matrix.size() - 1 - j))));
            }
        }
        return sum;
    }
}

class Result0210 {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = 0; j < matrix.size() / 2; j++) {
                        System.out.print(matrix.get(i).get(j));
                        System.out.print(matrix.get(i).get(matrix.size() - 1 - j));
                        System.out.print(matrix.get(matrix.size() - 1 - i).get(j));
                System.out.print(matrix.get(matrix.size() - 1 - i).get(matrix.size() - 1 - j));
            }
            System.out.println();
        }
        return sum;
    }
}

class Solution0210 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            matrix.add(
                    Stream.of(scanner.nextLine()
                            .replaceAll("\\s+$", "")
                            .split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        }

        int result = Result0210.flippingMatrix(matrix);
        System.out.println(result);
    }
}
