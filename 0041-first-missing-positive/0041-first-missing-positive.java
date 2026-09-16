class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean [] check = new boolean[n+1];
        for(int i=0;i<n;i++){  
            check[i]=false;
        }
        for(int num:nums){
            if(num>0&&num<=n){
                check[num]=true;
            }
        } 
        for(int i=1;i<=n;i++){
            if(!check[i])return i;
        }
        return n+1;
    }
}
