package CodingBat;

import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(doubleX(str));


    }

    static boolean doubleX(String str) {

        boolean hasTwoX = false;

        for (int i = 0; i <= str.length() - 2; i++) {

            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                hasTwoX = true;
            }
            if (hasTwoX){
                break;
            }
        }
        if (hasTwoX) {
            return true;
        } else {
            return false;
        }
    }
}