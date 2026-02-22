class Solution {
    public int missingInteger(int[] nums) {
        // Arrays.sort(nums);
        int maxSum = nums[0];
        int size = nums.length;
        // Set<Integer> map=new HashSet<>();
        // Arrays.sort(nums);
        for (int i = 1; i < size; i++) {
            if (nums[i] == nums[i - 1] + 1)
                maxSum += nums[i];
            // map.put(maxSum,nums[i]);
            // maxSum+=nums[i];
            else
                break;
        }
        Set<Integer> set = toSet(nums);
        while (true) {
            if (!set.contains(maxSum))
                return maxSum;
            maxSum++;
        }
    }

    private Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        return set;
    }
    // Arrays.sort(nums);
    // for(int i=0;i<size;i++){
    //     if(maxSum==nums[i]){
    //         maxSum++;
    //     }
    // }
    // return maxSum;
    // }
}