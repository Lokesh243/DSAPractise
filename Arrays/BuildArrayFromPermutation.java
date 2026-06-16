import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = arr[arr[i]];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};

        int[] result = buildArray(arr);

        System.out.println(Arrays.toString(result));
    }
}