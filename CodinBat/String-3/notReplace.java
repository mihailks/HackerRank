package CodingBat;

public class notReplace {
    public static void main(String[] args) {
        String str = "This is right";
        System.out.println(notReplace(str));

    }

    public static String notReplace(String str) {
        String result = "";
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's' && !Character.isDigit(str.charAt(i + 2))) {
                result += "is not";
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
