public class stringYak {
    public static void main(String[] args) {
        String str = "yakpak";
        System.out.println(stringYak(str));

    }

    public static String stringYak(String str) {
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                finalString += str.charAt(i);
            }
        }

return finalString;
    }
}