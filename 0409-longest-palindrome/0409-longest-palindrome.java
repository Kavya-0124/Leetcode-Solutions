// class Solution {
//     public int longestPalindrome(String s) {
//         HashMap<Character,Integer> charFrequency=new HashMap<>();
//         int oddFreq=0;
//         for(char ch:s.toCharArray()){
//             charFrequency.put(ch,charFrequency.getOrDefault(ch,0)+1);
//             if((charFrequency.get(ch)%2)==1){
//                 oddFreq++;
//             }
//             else{
//                 oddFreq--;
//             }
//         }
//         if(oddFreq>0){
//             return s.length()-oddFreq+1;
//         }
//         else{
//             return s.length();
//         }
//     }
// }

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> chset=new HashSet<>();
        int res=0;

        for(char c:s.toCharArray()){
            if(chset.contains(c)){
                chset.remove(c);
                res+=2;
            }
            else{
                chset.add(c);
            }
        }
        if(!chset.isEmpty()) res++;

        return res;
    }
}