import java.util.*;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store value -> index
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        int[][] dp = new int[n][n];

        int ans = 0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < j; i++) {

                int previous = arr[j] - arr[i];

                if (map.containsKey(previous)) {

                    int k = map.get(previous);

                    if (k < i) {
                        dp[i][j] = dp[k][i] + 1;
                    }
                }

                // Minimum length of two elements
                if (dp[i][j] == 0) {
                    dp[i][j] = 2;
                }

                ans = Math.max(ans, dp[i][j]);
            }
        }

        return ans >= 3 ? ans : 0;
    }
}