class Solution {
    public int arraySign(int[] nums) {
     int sign = 1;
        for(int val : nums){
            if(val == 0)    return 0;
            
            if(val < 0){
                sign = -sign;
            }
        }
        return sign;
    }
}