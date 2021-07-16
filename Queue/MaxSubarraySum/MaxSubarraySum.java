package Queue.MaxSubarraySum;

import java.util.ArrayDeque;

public class MaxSubarraySum {
    int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n==0 || k==0) return new int[0];
        var max=new int[n-k+1];
        var deq=new ArrayDeque<Integer>();
        int i;
        for( i=0;i<k;i++){
            while(!deq.isEmpty() && nums[i]>nums[deq.peekLast()]){
                deq.pollLast();
            }
           deq.addLast(i);
        }
        max[0]=nums[deq.peekFirst()];
        while(i<n){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k ){
                deq.pollFirst(); 
            }
            while(!deq.isEmpty() && nums[i]>nums[deq.peekLast()]){
                deq.pollLast();  
            }
            deq.addLast(i);
            max[i-k+1]=nums[deq.peekFirst()];
            i++;
        }
        return max;
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
