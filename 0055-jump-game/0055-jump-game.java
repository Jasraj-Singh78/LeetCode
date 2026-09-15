class Solution {
    public boolean canJump(int[] nums) {
        int gas=0;
        for(int num:nums){
            if(gas<0)return false;

            else if(gas<num)gas=num;
        
    
        gas--;
        }
    
    return true;
}

}