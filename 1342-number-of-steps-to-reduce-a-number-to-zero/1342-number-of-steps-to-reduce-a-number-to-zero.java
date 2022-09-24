class Solution {
    public int numberOfSteps(int num) {
        //int temp=0;
        int count=0;
        //int i=num;
        while(num!=0){
        
            if(num%2==0){
                num=num/2;
                //i++;
            }
            else{
                num=num-1;
                //temp=k/2;
                //i++;
            }
            
           count++; 
        }
        
        return count;
    }
}