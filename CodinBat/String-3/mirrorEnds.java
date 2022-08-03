package CodingBat;

public class mirrorEnds {
    public static void main(String[] args) {
        String string = "abXYZba";
        System.out.println(mirrorEnds(string));
    }

    public static String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char first = string.charAt(i);
            char last = string.charAt(string.length() - i - 1);
            if (first==last){
                result+=first;
            } else {
                break;
            }
        }
        return result;
    }

}
