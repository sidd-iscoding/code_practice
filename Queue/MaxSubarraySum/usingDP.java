//Time complexity O(N) and Space=O(N)
package Queue.MaxSubarraySum;

public class usingDP {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // assume nums is not null
        if (nums.length == 0 || k == 0) {
          return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1]; // number of windows
        
        // left & right
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0]; // init
        right[n - 1] = nums[n - 1];
        
        for (int i = 1; i < n; ++i) {
          // left
          if (i % k == 0) left[i] = nums[i];
          else            left[i] = Math.max(left[i - 1], nums[i]);
          // right
          int j = n - i - 1;
          if (j % k == (k - 1)) right[j] = nums[j];
          else                  right[j] = Math.max(right[j + 1], nums[j]);
        }
        
        // dp
        for (int i = 0, j = i + k - 1; j < n; ++i, ++j) {
          result[i] = Math.max(right[i], left[j]);
        }
        
        return result;
    }
    public static void main(String[] args) {
        var ms=new MaxSubarraySum();
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] result=new int[nums.length];
        result=ms.maxSlidingWindow(nums, k);
        for(int i:result){
            System.out.print(i);
        }
    }
}
