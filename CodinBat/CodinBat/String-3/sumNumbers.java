package CodingBat;

public class sumNumbers {
    public static void main(String[] args) {
        String str = "aa11b33";
        System.out.println(sumNumbers(str));
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String temp = "";
        if (str.length()==0){
            return sum;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char currentDigit = str.charAt(i);

                if (Character.isDigit(currentDigit)) {
                    temp += currentDigit;
                }
                else {
                    if (temp.length()>=1){
                        sum += Integer.parseInt(temp);
                    }
                    temp = "";
                }
            }
        }
        if (Character.isDigit(str.charAt(str.length()-1))){
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
}
