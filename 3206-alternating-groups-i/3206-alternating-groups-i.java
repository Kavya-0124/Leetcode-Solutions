class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int len=colors.length;
        // int len2=colors.length(colors.length-1);
        int count=0;
        for(int i=0;i<len;i++){
            int left=colors[(i - 1 + len) % len];
            int right=colors[(i +1) % len];
            if(colors[i]!=left && colors[i]!=right){
                count++;
            }
        }
        return count;
    }
}