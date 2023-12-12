package String2;

public class P02countHi {
    public static void main(String[] args) {
        String str = "ABChi hi";
        System.out.println(countHi(str));
    }

    public static int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("hi")){
                counter++;
            }
        }

        return counter;
    }

}
