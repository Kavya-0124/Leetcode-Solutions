class Solution {
    public int longestConsecutive(int[] nums) {
        int maxSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currnum = num;
                int count = 1;
                while (set.contains(currnum + 1)) {
                    currnum++;
                    count++;
                }
                maxSum = Math.max(maxSum, count);
            }
            //  maxSum = Math.max(currnum, count);
        }
        return maxSum;

    }
}