package CodingBat;

public class P05endOther {
    public static void main(String[] args) {
        String a = "AbC";
        String b = "HiaBc";
        System.out.println(endOther(a, b));
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length()>b.length()){
            if (b.equals(a.substring(a.length() - b.length(), a.length()))) {
                return true;
            }
        } else if (a.equals(b.substring(b.length() - a.length(), b.length()))) {
            return true;
        }
        return false;
    }

}
