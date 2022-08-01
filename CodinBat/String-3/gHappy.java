package CodingBat;

public class gHappy {
    public static void main(String[] args) {
        String str = "xxggxx";
        System.out.println(gHappy(str));
    }

    public static boolean gHappy(String str) {
        boolean isHappy = false;
        for (int i = 0; i < str.length() - 1; i+=2) {
            if (str.charAt(i) == 'g' && (str.charAt(i + 1) == 'g' || str.charAt(i - 1) == 'g')) {
                isHappy = true;
            } else if (str.charAt(i) == 'g' && (str.charAt(i + 1) != 'g' || str.charAt(i - 1) != 'g')) {
                isHappy = false;
            }
        }
        return isHappy;
    }

}
