class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    int rows=nums.length;
        int col=nums[0].length;
        
        if((rows*col)!=(r*c))
            return nums;
        
        int[][] output_arr=new int [r][c];
        int row_nums=0;
        int col_nums=0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                output_arr[row_nums][col_nums]=nums[i][j];
                col_nums++;
                
                if(col_nums==c){
                    col_nums=0;
                    row_nums++;
                }
            }
        }
        return output_arr;
   }
}