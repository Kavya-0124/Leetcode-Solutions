class Solution {
    public int climbStairs(int n) {
      int a=0;
        int b=1;
        int c=a+b;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
        
    }
}