class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0=coordinates[0][0];
        int y0=coordinates[0][1];
        int x1=coordinates[1][0];
        int y1=coordinates[1][1];
        
        int dx=x1-x0;
        int dy=y1-y0;
        
        for(int[] arr:coordinates){
            int x=arr[0];
            int y=arr[1];
            if(dx*(y-y0)!=dy*(x-x0))
                return false;
        }
        return true;
    }
}