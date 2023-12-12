public class altPairs {
    public static void main(String[] args) {
        String str = "Chocolate";
        System.out.println(altPairs(str));
    }
    public static String altPairs(String str) {
        if (str.length()<=1) return str;
        String newString="";
        for (int i = 0; i<str.length();i+=4){
            if (i<str.length()-1){
                newString += str.charAt(i);
                newString += str.charAt(i+1);
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }



}
