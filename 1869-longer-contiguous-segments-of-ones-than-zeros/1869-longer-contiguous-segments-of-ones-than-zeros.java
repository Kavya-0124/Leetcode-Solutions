class Solution {
    public boolean checkZeroOnes(String s) {
        int count0=0;
        int count1=0;
        int i=0;
        while(i<s.length()){
            int count=0;
            while(i<s.length() && s.charAt(i)=='1'){
                count++;
                i++;
            }
            count1=Math.max(count,count1);
            count=0;
            while(i<s.length() && s.charAt(i)=='0'){
                count++;
                i++;
            }
            count0=Math.max(count,count0);
        }
        if(count1>count0) return true;
        return false;
    }
}