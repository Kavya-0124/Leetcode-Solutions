class Solution {
    public int missingInteger(int[] nums) {
        // Arrays.sort(nums);
        int maxSum=nums[0];
        int size=nums.length;
        // Arrays.sort(nums);
        for(int i=1;i<size;i++){
            if(nums[i]==nums[i-1]+1){
                maxSum+=nums[i];
            }
            else break;
        }
        Arrays.sort(nums);
        for(int i=0;i<size;i++){
            if(maxSum==nums[i]){
                maxSum++;
            }
        }
        return maxSum;
    }
}