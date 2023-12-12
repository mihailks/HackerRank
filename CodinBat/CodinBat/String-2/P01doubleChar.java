package String2;

public class P01doubleChar {
    public static void main(String[] args) {
        String str = "The";
        System.out.println(doubleChar(str));
    }

    public static String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }
}
