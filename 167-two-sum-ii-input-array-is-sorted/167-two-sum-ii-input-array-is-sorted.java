class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int s=0;
        //int index=0;
        while(s<n){
            int sum=numbers[s]+numbers[n];
            if(sum==target){
                return new int[] {s+1,n+1};
            }
            else if(sum>target){
                n--;
            }
            else
                s++;
        }
        return new int[] {};
    }
}