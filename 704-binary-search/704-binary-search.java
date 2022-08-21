class Solution {
    public int search(int[] nums, int target) {
        int r=nums.length-1;
        int l=0;
        int h=r;
        for(int i=0;i<nums.length;i++)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
        
            if(target>nums[mid])
            {
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return -1;
        
    }
}