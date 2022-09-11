class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
      int c=0;
        int n=s1.length();
        char [] ch1=s1.toCharArray();
        char [] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(String.valueOf(ch1).equals(String.valueOf(ch2))){
            for(int i=0;i<n;i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    c++;
                }
            }
            if(c==2||c==0)
                return true;
            
        }
        return false;
    }
}