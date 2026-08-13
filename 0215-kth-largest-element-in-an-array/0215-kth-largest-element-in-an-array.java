class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n-k] ;
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minheap.add(nums[i]);
            if(minheap.size()>k)minheap.poll();

        }
        return minheap.peek();
    }
}