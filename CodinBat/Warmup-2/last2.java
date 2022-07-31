public class last2 {
    public static void main(String[] args) {
        String a = "xxcaazz";
        String b = "xxbaaz";
        System.out.println(stringMatch(a, b));
    }

    public static int stringMatch(String a, String b) {
        String inputOne = "";
        String inputTwo = "";
        int minLength = Math.min(a.length(), b.length());
        if (minLength <= 1) return 0;
        int counter = 0;
        for (int i = 0; i < minLength - 1; i++) {
            inputOne=a.substring(i, i + 2);
            inputTwo=b.substring(i, i + 2);
            if (inputOne.equals(inputTwo)) {
                counter++;
            }
        }
        return counter;
    }
    //inputOne = a.substring(i,i+1);
}
