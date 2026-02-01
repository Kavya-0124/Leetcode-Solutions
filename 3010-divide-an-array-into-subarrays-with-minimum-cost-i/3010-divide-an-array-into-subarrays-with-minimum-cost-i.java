class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums,1,n);
        return nums[0]+nums[1]+nums[2];
    }
}