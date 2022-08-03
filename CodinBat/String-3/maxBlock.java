package CodingBat;

public class maxBlock {
    public static void main(String[] args) {
        String str = "abbCCCddBBBxx";
        System.out.println(maxBlock(str));
    }

    public static int maxBlock(String str) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                char first = str.charAt(i);
                char second = str.charAt(j);
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                } else {
                    if (max < counter){
                        max=counter;
                        counter = 0;
                    }
                    break;
                }
            }
        }
        return max;
    }
}
