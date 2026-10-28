class Solution {
    public static int solve(int coins[],int amount,int n,int dp[][]){
        //base case
        if(amount==0)return 1;
        if( amount <= 0 || n == 0 )return 0;
        if(dp[n][amount]!=-1)return dp[n][amount];

        //include and exclude
        if(coins[n-1]<=amount){
            //include                               //exclude
            return dp[n][amount]=solve(coins,amount-coins[n-1],n,dp) + solve(coins , amount , n-1,dp);
        }
        //exclude
        else{
            return dp[n][amount]=solve(coins,amount,n-1,dp);
        }

    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][]=new int [n+1][amount+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(coins,amount,n,dp);
    }
}