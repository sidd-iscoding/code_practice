Remove duplicate elements from a sorted  array in O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1; 			//print the first i+1 elements of the array which are devoid of any duplicate elements
    }
}

//Note : if we remove duplicate elements from an unsorted array we need to first sort the array in O(nlogn ) then the above algo