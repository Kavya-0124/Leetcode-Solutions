class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        Stack<Integer> open=new Stack<>();
        int[] pair=new int[n];

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open.push(i);
            }
            if(s.charAt(i)==')'){
                int j=open.pop();
                pair[i]=j;
                pair[j]=i;
            }
        }

        StringBuilder res=new StringBuilder();
        for(int currIndex=0,direction=1; currIndex<n;currIndex+=direction){
            if(s.charAt(currIndex)=='(' || s.charAt(currIndex)==')'){
                currIndex=pair[currIndex];
                direction=-direction;
            }
            else{
                res.append(s.charAt(currIndex));
            }
        }
        return res.toString();
    }
}