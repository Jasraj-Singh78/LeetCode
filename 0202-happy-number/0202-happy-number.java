class Solution {
    public boolean isHappy(int n) {
    while(n!=1 && n!=4){ //Since 4 is part of that cycle, every unhappy number must pass through 4.
        int sum = 0;
        while(n!=0){
            int r = n%10;
            n/=10;
            sum = r*r + sum;
        }
        n = sum;        
        }
        return n==1;
    }
}