class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long total=0;
        long sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total+=grid[i][j];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                sum += grid[i][j];
            }
            if (sum == total-sum) {
                return true;
            }
        }
        sum=0;
        for(int j=0;j<m-1;j++){
            for(int i=0;i<n;i++){
                sum+=grid[i][j];
                if(sum==total-sum){
                    return true;
                }
            }
        }
        return false;
    }
}