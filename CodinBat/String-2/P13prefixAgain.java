package CodingBat;

public class P13prefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 2;
        System.out.println(prefixAgain(str,n));
    }

    public static boolean prefixAgain(String str, int n) {

        String first = str.substring(0,n);
        String last = str.substring(n);
        if (last.contains(first)){
            return true;
        } else {
            return false;
        }
    }
}
