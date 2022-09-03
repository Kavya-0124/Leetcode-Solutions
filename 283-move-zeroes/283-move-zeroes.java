class Solution 
{
    public void moveZeroes(int[] nums)
    {
        int i=0;
        //int j=nums.length-1;
        //int k=nums.length-1;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }   
        }
    }
}