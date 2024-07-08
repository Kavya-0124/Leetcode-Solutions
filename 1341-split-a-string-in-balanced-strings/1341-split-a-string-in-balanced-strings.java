class Solution {
    public int balancedStringSplit(String s) {
        int temp=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='R') temp++;
            if(c=='L') temp--;
            if(temp==0) sum++;
        }
        return sum;
    }
}