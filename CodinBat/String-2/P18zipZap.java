package String2;

public class P18zipZap {
    public static void main(String[] args) {
        String str = "zzzopzop";
        System.out.println(zipZap(str));
    }

    public static String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length()-2; i+=3) {
            if (str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                result+=str.charAt(i);
                result+=str.charAt(i+2);
            }
        }
        return result;
    }
}
