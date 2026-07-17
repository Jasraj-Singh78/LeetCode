class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
      
        while(start<=end){
              int mid=start+(end-start)/2;// to handle 2 to power 31 value if start and end both point at that 2^31+^31/2 would go out of bound for integer value so we subract so that it dont happen 
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }
}