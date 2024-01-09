package org.example.week_03;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result0303 {

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < ar.size(); i++) {
            pairs.putIfAbsent(ar.get(i), 0);
            pairs.put(ar.get(i), pairs.get(ar.get(i)) + 1);
        }

        AtomicInteger result = new AtomicInteger();

        pairs.values()
                .forEach(v -> {
                    result.addAndGet(v / 2);
                });

        List<Integer> collect = pairs.values().stream().sorted().collect(toList());

        return Integer.parseInt(String.valueOf(result));
    }

}

class Solution0303 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result0303.sockMerchant(n, ar);

        System.out.println(result);
    }
}

