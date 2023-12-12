package String2;

public class P17oneTwo {
    public static void main(String[] args) {
        String str = "tcagdo";
        System.out.println(oneTwo(str));
    }

    public static String oneTwo(String str) {
        String result = "";
        for(int i=0; i <str.length()-2; i += 3)
        {
            result +=str.substring(i+1,i+3) + str.charAt(i);
        }
        return result;
    }
}
