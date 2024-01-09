package org.example.week_03;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result0305 {


    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            result.putIfAbsent(arr.get(i), 0);
            result.put(arr.get(i), result.get(arr.get(i)) + 1);
        }

        List<Integer> collect = result.values()
                .stream()
                .sorted(Comparator.comparing(Integer::))
                .collect(toList());

        return collect.get(0);

    }

}

class Solution0305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result0305.migratoryBirds(arr);

        System.out.println(result);
    }
}

