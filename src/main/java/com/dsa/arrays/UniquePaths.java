package com.dsa.arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // Initialize a 2D array to store the number of unique paths
        int[][] dp = new int[m][n];

        // Initialize the first row and first column to 1 (only one way to reach these cells)
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill in the rest of the array using dynamic programming
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The value in the bottom-right corner represents the total number of unique paths
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePaths solution = new UniquePaths();
        int m = 2;
        int n = 2;
        System.out.println(solution.uniquePaths(m, n));  // Output: 28
    }
}

