public class array667 {
    public static void main(String[] args) {
        int[] nums = {2, 7, -2, 4, 9, 3};
        System.out.println(has271(nums));
    }

    public static boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            if (nums[i + 1] == value && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

}
