class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n=grid.length;
       int size=n*n;
       Set<Integer> seen=new HashSet<>();
       int rep=-1, miss=-1;

       for(int[] row:grid){
        for(int num:row){
            if(!seen.add(num)){
                rep=num;
            }
        }
       } 

       for(int num=1;num<=size;num++){
        if(!seen.contains(num)){
            miss=num;
            break;
        }
       }
       return new int[]{rep,miss};

    }
}