class Solution {
    public int subtractProductAndSum(int n) {
     int sum=0;
        int pro=1;
        int rem=0;
        //int j=pro-sum;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            pro*=rem;
            n=n/10;
            //return pro-sum;
            //int j=pro-sum;
            //j=pro-sum;
        }
        int ans=pro-sum;
        return ans;
    }
}