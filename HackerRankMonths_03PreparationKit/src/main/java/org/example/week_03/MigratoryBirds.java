package org.example.week_03;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result0305 {


    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            map.putIfAbsent(arr.get(i), 0);
            map.put(arr.get(i), map.get(arr.get(i)) + 1);
        }

        int ans = 0;
        int id = 0;
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > ans) {
                ans = entry.getValue();
                id = entry.getKey();
            }
        }
        return id;
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

