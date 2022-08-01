package CodingBat;

public class withoutString_rev02 {
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
            if (removeLength+i <= base.length() && base.substring(i,i+removeLength).equalsIgnoreCase(remove)){
                i += removeLength-1;
            } else {
                result+=base.charAt(i);
            }
        }
        return result;
    }

}
