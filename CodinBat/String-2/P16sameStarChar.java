package String2;

public class P16sameStarChar {
    public static void main(String[] args) {
        String str = "**";
        System.out.println(sameStarChar(str));
    }
    public static boolean sameStarChar(String str) {
        int counterTotalStars = 0;
        int counterPositive=0;
        if (str.equals("*")||str.equals("**")||str.equals("")){
            return true;
        }
        if (str.length()<3){
            return false;
        }
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i)=='*'){
                counterTotalStars++;
            }
        }
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i)=='*'){
                if (str.charAt(i-1)==str.charAt(i+1)){
                    counterPositive++;
                }
            }
        }
        if (counterTotalStars==counterPositive){
            return true;
        } else {
            return false;
        }
    }
}
