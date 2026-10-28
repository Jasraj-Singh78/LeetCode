import java.util.Arrays;
class Solution {
public static int solve(int coins[], int amount, int n, int dp[][]) {

    // Base cases
    if (amount == 0) return 0;

    if (amount < 0 || n == 0) {
        return Integer.MAX_VALUE;
    }

    if (dp[n][amount] != -1) {
        return dp[n][amount];
    }

    // Include and exclude
    if (coins[n - 1] <= amount) {

        // Include
        int result = solve(coins, amount - coins[n - 1], n, dp);

        int include = Integer.MAX_VALUE;

        if (result != Integer.MAX_VALUE) {
            include = 1 + result;
        }

        // Exclude
        int exclude = solve(coins, amount, n - 1, dp);

        return dp[n][amount] = Math.min(include, exclude);

    } else {

        // Exclude
        return dp[n][amount] = solve(coins, amount, n - 1, dp);
    }
}

public int coinChange(int[] coins, int amount) {

    int n = coins.length;

    int dp[][] = new int[n + 1][amount + 1];

    for (int row[] : dp) {
        Arrays.fill(row, -1);
    }

    int ans = solve(coins, amount, n, dp);

    return ans == Integer.MAX_VALUE  ? -1 : ans;
}


}
