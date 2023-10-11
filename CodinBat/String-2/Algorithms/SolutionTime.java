package String2.Algorithms;

import java.io.*;

public class SolutionTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();

        String result = ResultTime.timeConversion(s);


    }
}

class ResultTime {
    public static String timeConversion(String s) {
        String dayPart = s.substring(s.length() - 2);
        int hours = Integer.parseInt(s.substring(0, 2));
        if (dayPart.equals("AM")) {
            String substring = s.substring(0, s.length() - 2);
            return substring;
        }
        hours += 12;
        String s1 = hours + s.substring(2, s.length() - 2);
        return s1;
    }

}

