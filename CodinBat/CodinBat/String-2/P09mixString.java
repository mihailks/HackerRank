package CodingBat;

public class P09mixString {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        System.out.println(mixString(a, b));
    }

    public static String mixString(String a, String b) {
        String str = "";
        int len = 0;

        if (a.length() >= b.length()) {
            len = a.length();
        } else
            len = b.length();

        for (int i = 0; i < len; i++) {

            if (i < a.length()) {
                str += a.charAt(i);
            }

            if (i < b.length()) {
                str += b.charAt(i);
            }

        }
        return str;
    }
}
