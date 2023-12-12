public class stringX {
    public static void main(String[] args) {
        String str = "xHix";
        System.out.println(stringX(str));
    }
    public static String stringX(String str) {
        if (str.length()<=2) return str;
        String finish = "";
        for (int i= 0;i<str.length();i++){
            if (str.charAt(i)!='x'){
                finish += str.charAt(i);
            }
        }
        int last = str.length()-1;
        if (str.charAt(0)=='x' && str.charAt(last)=='x'){
            return "x" + finish + "x";
        } else {
            return finish;
        }
    }
}
