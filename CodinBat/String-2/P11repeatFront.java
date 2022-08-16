package CodingBat;

public class P11repeatFront {
    public static void main(String[] args) {
        String str = "Chocolate";
        int n = 4;
        System.out.println(repeatFront(str, n));
    }

    public static String repeatFront(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result+=str.substring(0,n-i);
        }

        return result;
    }

}
