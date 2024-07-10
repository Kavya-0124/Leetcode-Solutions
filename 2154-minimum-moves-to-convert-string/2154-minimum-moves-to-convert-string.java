class Solution {
    public int minimumMoves(String s) {
        int n=0;
        int step=0;
        while(n<s.length()){
            if(s.charAt(n)=='X'){
            n=n+3;
            step++;
        }
        else{
            n++;
        }
    }
    return step;
    } 
}