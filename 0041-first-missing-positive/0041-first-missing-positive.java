class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean [] check = new boolean[n];
        for(int i=0;i<n;i++){  
            check[i]=false;
        }
        for(int num:nums){
            if(num>0&&num<=n){
                check[num-1]=true;
            }
        } 
        for(int i=0;i<n;i++){
            if(!check[i])return i+1;
        }
        return n+1;
    }
}