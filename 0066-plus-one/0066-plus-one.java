class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] ans=new int[digits.length+1]; //if array is 999 we need addition space for 1 to get 1000
        ans[0]=1;     //not return digits just return ans as 1,0,0,0 ;
        return ans;
    }
}