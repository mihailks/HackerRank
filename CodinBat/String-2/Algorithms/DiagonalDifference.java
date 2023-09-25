package String2.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));


        int mainDiag = 0;
        int otherDiag = 0;
//        for (int i = 0; i < matrix.size(); i++) {
//            for (int j = 0; j < matrix.get(i).size(); j++) {
//                if (i == j) {
//                    mainDiag += matrix.get(i).get(j);
//                }
//            }
//        }

        //s=s+a [r][ N+1- r]

        for (int i = 0; i < matrix.size(); i++) {
                    mainDiag += matrix.get(i).get(i);
                    otherDiag += matrix.get(i).get(matrix.get(i).size()-1-i);
        }


        System.out.println(mainDiag);
        System.out.println(otherDiag);


        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
