class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String val=String.valueOf(num);
        int size=val.length();
        for(int i=0;i<=size-k;i++){
            String sub=val.substring(i,i+k);
            int ans=Integer.parseInt(sub);
            if(ans!=0 && num%ans==0){
                count++;
            }
        }
        return count;
    }
}