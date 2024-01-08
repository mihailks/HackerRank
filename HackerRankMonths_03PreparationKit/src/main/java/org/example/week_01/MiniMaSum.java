package org.example.week_01;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result02 {
    public static void miniMaxSum(List<Integer> arr) {

        arr = arr.stream().sorted().collect(toList());

        long maxSum = 0;
        long minSum = 0;

        for (int i = 0; i < arr.size()-1; i++) {
            minSum+=arr.get(i);
        }

        for (int i = 1; i < arr.size(); i++) {
            maxSum+=arr.get(i);
        }

        System.out.print(minSum + " " + maxSum);
    }

}

class Solution02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result02.miniMaxSum(arr);

        bufferedReader.close();
    }
}

