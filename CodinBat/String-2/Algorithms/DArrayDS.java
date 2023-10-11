package String2.Algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ResultDArrayDS {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = 0; j < arr.size()-2; j++) {
                currentSum += arr.get(i).get(j);
                currentSum += arr.get(i).get(j + 1);
                currentSum += arr.get(i).get(j + 2);
                currentSum += arr.get(i + 1).get(j + 1);
                currentSum += arr.get(i + 2).get(j);
                currentSum += arr.get(i + 2).get(j + 1);
                currentSum += arr.get(i + 2).get(j + 2);
                if (currentSum>maxSum){
                    maxSum = currentSum;
                }
                currentSum = 0;
            }
        }

        return maxSum;
    }

}

public class DArrayDS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = ResultDArrayDS.hourglassSum(arr);
        System.out.println(result);
    }
}
