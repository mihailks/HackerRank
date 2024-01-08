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

class Result0208 {

    public static String pangrams(String s) {
        int[] count = new int[26];
        String lowerCase = s.replace(" ", "").toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            count[lowerCase.charAt(i)-97] = count[lowerCase.charAt(i)-97]+1;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0){
                return "not pangram";
            }
        }
        return "pangram";
    }

}

class Solution0208 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result0208.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

