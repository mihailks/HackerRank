package org.example.week_01;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result01 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int minusConter = 0;
        int plusCounter = 0;

        for(int i = 0; i < arr.size(); i++){
            if (arr.get(i) < 0) minusConter++;
            if (arr.get(i) > 0) plusCounter++;
        }
        int zero = arr.size()-minusConter-plusCounter;

        System.out.printf("%.6f%n", plusCounter*1.0/arr.size());
        System.out.printf("%.6f%n", minusConter*1.0/arr.size());
        System.out.printf("%.6f%n", zero*1.0/arr.size());
    }

}

class Solution01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result01.plusMinus(arr);

        bufferedReader.close();
    }
}

