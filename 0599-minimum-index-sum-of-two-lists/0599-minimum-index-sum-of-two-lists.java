class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum=0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        List<String> list=new ArrayList<>();
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                sum=j+map.get(list2[j]);
                min=Math.min(min,sum);
            }
        }

        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                sum=j+map.get(list2[j]);
                if(sum==min){
                    list.add(list2[j]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}