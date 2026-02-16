class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int[] res=new int[size];
        int[] suff=new int[size];
        int[] prod=new int[size];

        suff[size-1]=1;
        prod[0]=1;

        for(int i=1;i<size;i++){
            prod[i]=nums[i-1]*prod[i-1];
        }
        for(int i=size-2;i>=0;i--){
            suff[i]=nums[i+1]*suff[i+1];
        }
        for(int i=0;i<size;i++){
            res[i]=prod[i]*suff[i];
        }
        return res;
    }
}
