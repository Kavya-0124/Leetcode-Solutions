class Solution
{
    public int[] sortedSquares(int[] nums)
    {
     int[] res = new int[nums.length];
    int i = 0; // most negative element
    int j = nums.length-1; // most positive element
    int index = nums.length-1; // help in filling the result
    
    while(i <= j) {
        int val1 = nums[i] * nums[i];
        int val2 = nums[j] * nums[j];
        
        if(val1 > val2) {
            res[index] = val1;
            i++;
        } else {
            res[index] = val2; // condition - val2 > val1
            j--;
        }
        index--;
    }
    return res;

}
}
