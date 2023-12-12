package CodingBat;

public class sumDigits {
    public static void main(String[] args) {
        String str = "aa1bc2d3";
        System.out.println(sumDigits(str));
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }
}
