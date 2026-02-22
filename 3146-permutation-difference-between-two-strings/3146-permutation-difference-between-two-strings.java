class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        // Map<Integer,Integer> map2=new HashMap<>();
        int sum=0;

        for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            sum+=Math.abs(i-map.get(ch));
        }
        // if(s.charAt(i)==t.charAt(j)){
        //     sum+=Math.abs(nums[i]+nums[j]);
        // }
        return sum;
    }
}