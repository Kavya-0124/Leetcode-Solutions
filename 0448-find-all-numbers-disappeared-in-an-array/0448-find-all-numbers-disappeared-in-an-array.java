class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        Set<Integer> map=new HashSet<>();
        for(int i:nums){
            map.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}