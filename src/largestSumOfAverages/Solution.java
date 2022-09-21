package largestSumOfAverages;

// not my solution, figure it out later
public class Solution {
    public double largestSumOfAverages(int[] A, int K) {
        int n = A.length;

        double[] prefixSum = new double[n+1];
        for (int i = 0; i < n ; i++) {
            prefixSum[i + 1] = prefixSum[i] + A[i];
        }

        double[] dp = new double[n];
        for (int i = 0; i < n; i++) {
            dp[i] = (prefixSum[n] - prefixSum[i]) / (n - i);
        }

        for (int k = 0; k < K - 1; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    dp[i] = Math.max(dp[i], ((prefixSum[j] - prefixSum[i]) / (j - i)) + dp[j]);
                }
            }
        }
        return dp[0];
    }
}