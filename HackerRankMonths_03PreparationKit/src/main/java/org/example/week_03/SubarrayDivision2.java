package org.example.week_03;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result0302 {

    public static int birthday(List<Integer> s, int sum, int numberOfElements) {
        int counter = 0;

        for (int i = 0; i < s.size() - numberOfElements + 1; i++) {
            int currentSum = 0;

            for (int j = 0; j < numberOfElements; j++) {
                currentSum += s.get(i + j);
            }
            if (currentSum == sum) {
                counter++;
            }
        }
        return counter;
    }

}

class Solution0302 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result0302.birthday(s, d, m);

        System.out.println(result);
    }
}

