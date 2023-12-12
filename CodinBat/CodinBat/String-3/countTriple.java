package CodingBat;

public class countTriple {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(countTriple(str));
    }

    public static int countTriple(String str) {
        int counter = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            }
        }
        return counter;
    }

}
