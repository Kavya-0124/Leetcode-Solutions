class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] dp=new int[101];
        for(int i:nums){
            dp[i]++;
        }
        int count=0;
        for(int i:nums){
            int k=dp[i];
            if(k>1){
                count+=(k*(k-1))/2;
                dp[i]=0;
            }
        }
        return count;
    }
}