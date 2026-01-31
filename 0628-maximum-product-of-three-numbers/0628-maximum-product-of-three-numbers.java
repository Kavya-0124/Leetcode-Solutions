class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int min1=nums[0];
       int min2=nums[1];
       int min3=nums[2];
       int max1=nums[nums.length-1];
       int max2=nums[nums.length-2];
       int max3=nums[nums.length-3];

       int res=max1*max2*max3;
       int res1=min1*min2*max1;


       return Math.max(res,res1); 
    }
}