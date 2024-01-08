package org.example.week_02;

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

class Result0203 {
    public static long flippingBits(long n) {
        long result = 0;

        Deque<Long> queue = new ArrayDeque<>();

        while (n != 0) {
            queue.push(n % 2);
            n /= 2;
        }
        List<Integer> temp = new ArrayList<>();
        while (!queue.isEmpty()){
            if (queue.poll() == 1){
                temp.add(0);
            } else{
                temp.add(1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : temp) {
            stringBuilder.append(i);
        }

        long l = Long.parseLong(stringBuilder.toString(), 10);
        return (long) (Math.pow(2, 32) - (n + 1)); //FIXME FINISH THE OTHER SOLUTION
    }
}


class Solution0203 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Long result = Result0203.flippingBits(Long.parseLong(scanner.nextLine()));
            System.out.println(result);
        }
    }
}

