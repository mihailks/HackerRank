package org.example.week_02;

import java.io.*;

class Result0206 {

    public static int countingValleys(int steps, String path) {
        int counter = 0;
        int level = 0;
        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == 'D') {

                if (level - 1 == -1) {
                    counter++;
                }
                level--;
            }
            if (path.charAt(i) == 'U') {
                level++;
            }

        }
        return counter;
    }

}

class Solution0206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result0206.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

