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

class Result03 {
    public static String timeConversion(String s) {

        String[] time = s.split(":");

        String hour = time[0];
        String minute = time[1];
        String second = time[2].substring(0,2);
        String dayEve = time[2].substring(2,4);

        if (dayEve.equals("PM") && !hour.equals("12")){
            int hourInt = Integer.parseInt(hour);
            hourInt+=12;
            hour = Integer.toString(hourInt);
        }

        if (dayEve.equals("AM") && hour.equals("12")){
            hour = "00";
        }

        return hour + ":" + minute + ":" + second;
    }
// 07:05:45PM
// 19:05:45
}

class Solution03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result03.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

