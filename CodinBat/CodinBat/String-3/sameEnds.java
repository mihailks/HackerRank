package CodingBat;

public class sameEnds {
    public static void main(String[] args) {
        String string = "javaXYZjava";
        System.out.println(sameEnds(string));
    }

    public static String sameEnds(String string) {
        String result = "";
        int index = 0;
        int odd = string.length();
        if (string.length()%2!=0 && string.length()!=1 && string.length()!=3){
            odd++;
        }
        for (int i = 0; i < odd / 2; i++) {
            char first = string.charAt(index);
            char last = string.charAt(string.length() / 2 + i);

            if (first == last) {
                result += string.charAt(index);
                index++;
            }
        }
        return result;
    }
}
