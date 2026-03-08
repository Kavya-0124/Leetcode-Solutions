class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }

        return list;
    }
}