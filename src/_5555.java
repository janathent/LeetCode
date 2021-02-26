public class _5555 {
    public static void main(String[] args) {
        int n = 33;
        int[][] dp = new int[5][n + 1];
        for(int i = 0 ; i < 5 ; ++i){
            dp[i][1] = 1;
        }
        for(int i = 2 ; i <= n ; ++i){
            dp[0][i] = dp[0][i - 1] + dp[1][i - 1] + dp[2][i - 1] + dp[3][i - 1] + dp[4][i - 1];
            dp[1][i] = dp[1][i - 1] + dp[2][i - 1] + dp[3][i - 1] + dp[4][i - 1];
            dp[2][i] = dp[2][i - 1] + dp[3][i - 1] + dp[4][i - 1];
            dp[3][i] = dp[3][i - 1] + dp[4][i - 1] ;
            dp[4][i] = dp[4][i - 1];
        }
        System.out.println(dp[0][n] + dp[1][n] + dp[2][n] + dp[3][n] + dp[4][n]);
    }
}
