class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;
        // int count=0;
        // int i=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
            count1=Math.max(count,count1);

        }
        return count1;
        
    }
}