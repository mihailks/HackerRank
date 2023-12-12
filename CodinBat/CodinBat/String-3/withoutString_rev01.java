package CodingBat;

public class withoutString_rev01 {
    public static void main(String[] args) {
        String base = "This is a FISH";
        String remove = "IS";
        // He there
        System.out.println(withoutString(base, remove));
    }

    public static String withoutString(String base, String remove) {
        String result = base.replaceAll(remove, "");
        remove=remove.toLowerCase();
        result = base.replaceAll(remove, "");
        return result;
    }

}
// replaceAll("o","");