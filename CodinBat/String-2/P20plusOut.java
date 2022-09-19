public class P20plusOut {
    
    public static void main(String[] args) {
        String str = "12xy34";
        String word = "1";
        System.out.println(plusOut(str, word));
    }
    public static String plusOut(String str, String word) {
        String result = "";
        int wordLength = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+wordLength).equals(word)){
                result+=word;
                i+=wordLength;
            }
            else {
                result+="+";
            }
        }
        return result;
    }
}
