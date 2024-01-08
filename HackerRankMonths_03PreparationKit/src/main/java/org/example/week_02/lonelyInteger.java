package org.example.week_02;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Result0201 {

    public static int lonelyinteger(List<Integer> a) {
        int counter = 0;
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j <= a.size()-1; j++) {
                if (Objects.equals(a.get(i), a.get(j))) {
                    counter++;
                    result = a.get(i);
                }
            }
            if (counter == 1) {
                return result;
            }
            counter = 0;
        }
        return 0;
    }
}

class Solution0201 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result0201.lonelyinteger(input);

        System.out.println(result);
    }
}


