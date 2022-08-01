package CodingBat;

public class withoutString {
    public static void main(String[] args) {
        String base = "THIS is a FISH";
        String remove = "iS";
        // He there
        System.out.println(withoutString(base, remove));
    }

    public static String withoutString(String base, String remove) {
        String result = "";
        int removeLength = remove.length();
        for (int i = 0; i < base.length(); i++) {
            String temp = base.substring(i, removeLength + i);
            if (!temp.equalsIgnoreCase(remove) && removeLength+i <= base.length()) {
                result += base.charAt(i);
            } else {
                i += removeLength - 1;
            }
        }
        return result;
    }

}