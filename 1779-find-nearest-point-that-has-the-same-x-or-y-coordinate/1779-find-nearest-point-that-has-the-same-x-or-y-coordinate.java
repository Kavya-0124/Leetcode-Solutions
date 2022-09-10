class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
      int md = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0; i < points.length; i ++){
            if(x == points[i][0] || y == points[i][1]){
                int tempMD = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(tempMD < md){
                    md = tempMD;
                    idx = i;
                }
            }
        }
        return idx;
    }
}