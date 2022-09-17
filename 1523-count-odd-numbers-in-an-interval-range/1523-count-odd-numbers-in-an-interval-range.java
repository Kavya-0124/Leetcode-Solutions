class Solution
{
    public int countOdds(int low, int high) 
    {
       int i=(high-low)/2;
        if(high%2==1 || low%2==1){
          return i+1;  
        }
        else 
            return i;
    }
}

