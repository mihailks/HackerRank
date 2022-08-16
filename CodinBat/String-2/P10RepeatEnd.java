package CodingBat;

public class P10RepeatEnd {
    public static void main(String[] args) {
        String str = "Hello";


        System.out.println(repeatEnd(str));
    }

    public static String repeatEnd(String str) {
        int n = 2;
        String result = "";
        for (int i = 0; i < n; i++) {
            result+=str.substring(str.length()-n);
        }
        return result;
    }

}
