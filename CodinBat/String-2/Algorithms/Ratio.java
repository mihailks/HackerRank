package String2.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Ratio {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f%n", (double) positive / size);
        System.out.printf("%.6f%n", (double) negative / size);
        System.out.printf("%.6f%n", (double) zero / size);


    }
}

