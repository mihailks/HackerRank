public class P14xyzMiddle {
    public static void main(String[] args) {
        String str = "xyz";
        System.out.println(xyzMiddle(str));
    }

    public static boolean xyzMiddle(String str) {
        if (str.equals("xyz")) return true;
        if (!str.contains("xyz") || str.length() < 4) {
            return false;
        }
        int length = str.length() / 2;
        String test1 = str.substring(length - 1, length + 2);
        String test2 = str.substring(length - 2, length + 1);
        if (str.length() % 2 != 0) {
            if (test1.equals("xyz")) {
                return true;
            }
        } else {
            if (test1.equals("xyz") || test2.equals("xyz")) {
                return true;
            }
        }
        return false;
    }

}
