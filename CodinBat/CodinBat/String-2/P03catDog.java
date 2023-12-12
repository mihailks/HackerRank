package String2;

public class P03catDog {
    public static void main(String[] args) {
        String str = "A1cat1cadodog";
        System.out.println(catDog(str));
    }

    public static boolean catDog(String str) {
        int counterCat = 0;
        int counterDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                counterCat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                counterDog++;
            }
        }
        if (counterCat == counterDog) {
            return true;
        }
        return false;
    }
}