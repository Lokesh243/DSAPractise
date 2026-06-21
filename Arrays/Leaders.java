import java.util.*;

public class Leaders {

    public ArrayList<Integer> leaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                nums.add(max);
            }
        }

        Collections.reverse(nums);
        return nums;
    }

    public static void main(String[] args) {

        Leaders obj = new Leaders();

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = obj.leaders(arr);

        System.out.println("Leaders are: " + result);
    }
}
