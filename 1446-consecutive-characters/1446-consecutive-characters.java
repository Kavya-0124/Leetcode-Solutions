class Solution {
    public int maxPower(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.clear();
                map.put(ch,1);
            }
            // if (map.size() == 1) {
                max = Math.max(max, map.get(ch));
            // }
        }
        return max;
    }
}