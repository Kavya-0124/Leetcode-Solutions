class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        // int m=Integer.MIN_VALUE;
        int[] dp=new int[n];
        // dp[n]=0;
        for(int i=0;i<n;i++){
            
            if(i<2) dp[i]=cost[i];
            else dp[i]=cost[i]+ Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]); 
    }
}