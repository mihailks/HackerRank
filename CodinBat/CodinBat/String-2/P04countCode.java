package CodingBat;

public class P04countCode {
    public static void main(String[] args) {
        String str = "aaacodebbb";
        System.out.println(countCode(str));
    }

    public static int countCode(String str) {

        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }
        return counter;
    }
}
