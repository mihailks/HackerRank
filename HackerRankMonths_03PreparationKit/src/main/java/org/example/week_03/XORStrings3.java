package org.example.week_03;

import java.util.Scanner;

public class XORStrings3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '0' && second.charAt(i) == '0') {
                System.out.print("0");
            } else if (first.charAt(i) == '1' && second.charAt(i) == '0') {
                System.out.print("1");
            } else if (first.charAt(i) == '0' && second.charAt(i) == '1') {
                System.out.print("1");
            } else if (first.charAt(i) == '1' && second.charAt(i) == '1') {
                System.out.print("0");
            }
        }

    }
}
