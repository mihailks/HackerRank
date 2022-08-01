package CodingBat;

public class countYZ {
    public static void main(String[] args) {
        String str = "!!day--yaz!!";
        System.out.println(countYZ(str));
    }
    public static int countYZ(String str) {
        str=str.toLowerCase();
        int counter=0;
        int length = str.length()-1;
        for (int i = 1; i<str.length();i++){
            char temp = str.charAt(i);
            if (!Character.isLetter(temp)){
                if (str.charAt(i-1)=='y' || str.charAt(i-1) =='z'){
                    counter++;
                }
            }
        }
        if (str.charAt(length)=='y' || str.charAt(length)=='z'){
            counter++;
        }
        return counter;
    }
}
