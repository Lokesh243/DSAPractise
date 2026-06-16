public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};

        System.out.println(missingNumber(nums));
    }
}