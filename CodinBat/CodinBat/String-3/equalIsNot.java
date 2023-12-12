package CodingBat;

public class equalIsNot {
    public static void main(String[] args) {
        String str = "isisnotno7Not";
        System.out.println(equalIsNot(str));
    }

    public static boolean equalIsNot(String str) {
        int counterIs = 0;
        int counterNot = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'i' ) && (str.charAt(i + 1) == 's')) {
                counterIs++;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
                counterNot++;
            }
        }
        if (counterIs == counterNot) {
            return true;
        } else {
            return false;
        }
    }
}
