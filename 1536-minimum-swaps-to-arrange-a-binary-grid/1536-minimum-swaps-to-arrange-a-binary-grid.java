class Solution {
    public int minSwaps(int[][] grid) {
        int size=grid.length;
        int[] zeros=new int[size];
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=size-1;j>=0 && grid[i][j]==0;j--){
                // if(grid[i][j]==1){
                    count++;
                // }
                // zeros[i]=0;
            }
            zeros[i]=count;
        }
        int swaps=0;
        for(int i=0;i<size;i++){
            int rowneed=size-i-1;
            int j=i;
            while(j<size && zeros[j]<rowneed) j++;

            if(j==size) return -1;

            while(j>i){
                int temp=zeros[j];
                zeros[j]=zeros[j-1];
                zeros[j-1]=temp;
                j--;
                swaps++;
            }
        }
        return swaps;
    }
}