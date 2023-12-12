package CodingBat;

public class maxBlockREV01 {
    public static void main(String[] args) {
        String str = "hoopla";
        System.out.println(maxBlock(str));
    }

    public static int maxBlock(String str) {
        int max = Integer.MIN_VALUE;
        String temp = "";
        if (str.length() == 0) {
            return 0;
        }
        temp = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            if (temp.substring(0, 1).equals(str.substring(i, i + 1))) {
                temp += str.charAt(i);
            } else {
                temp = str.substring(i, i + 1);
            }
            if (max < temp.length()) {
                max = temp.length();
            }
        }
        return max;
    }
}
