class Solution {
    public boolean isPowerOfTwo(int n) {
        //Using bit Manipulation O(1);
        if(n<=0)return false;

        return ((n & (n-1))==0);

        //Using Recursion O(log n)
        // if(n==0)return false;
        // if(n==1)return true;
        // if(n%2!=0)return false;
        // return isPowerOfTwo(n/2);

    }
}