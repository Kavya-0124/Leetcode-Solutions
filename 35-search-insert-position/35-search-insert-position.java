class Solution {
    public int searchInsert(int[] nums, int target) {
    int l=0;
        int r=nums.length-1;
        while(l<=r){
            int minIndex=(l+r)/2;
            if(nums[minIndex]==target){
                return minIndex;
            }
            else if(nums[minIndex]>target){
                r=minIndex-1;
            }
            else{
                l=minIndex+1;
            }
        }
        return l;
    }
}