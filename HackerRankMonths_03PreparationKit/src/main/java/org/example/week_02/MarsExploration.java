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

class Result0209 {

    public static int marsExploration(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != 'S') {
                counter++;
            }

            if (s.charAt(i + 1) != 'O') {
                counter++;
            }

            if (s.charAt(i + 2) != 'S') {
                counter++;
            }
        }
        return counter;
    }

}

class Solution0209 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result0209.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


