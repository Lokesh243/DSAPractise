  import java.util.PriorityQueue;
  public class NthLargestUsingHeaps {
  
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {10, 4, 8, 15, 20, 3};

        System.out.println(findKthLargest(arr, 3));
    }
}
    
