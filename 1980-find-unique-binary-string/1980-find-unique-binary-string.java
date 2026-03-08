class Solution {
    int n;
    Set<String> numsSet=new HashSet<>();
    private String generate(String curr){
        if(curr.length()==n){
            if(!numsSet.contains(curr)){
                return curr;
            }
            return "";
        }
        String addzero=generate(curr+"0");
        if(addzero.length()>0){
            return addzero;
        }
        return generate(curr+"1");
    }
    public String findDifferentBinaryString(String[] nums) {
        n=nums.length;
        for(String s:nums){
            numsSet.add(s);
        }
        return generate("");
    }
}