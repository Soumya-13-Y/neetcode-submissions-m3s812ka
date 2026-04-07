class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        int c=0;
       Map<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
       }
       List<Map.Entry<Integer,Integer>> l=new ArrayList(m.entrySet());

       l.sort((a,b) -> b.getValue().compareTo(a.getValue()));
Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
for (Map.Entry<Integer, Integer> entry : l) {
    sortedMap.put(entry.getKey(), entry.getValue());
}


       for(Map.Entry<Integer,Integer> am:sortedMap.entrySet()){
if(c<k){
    arr[c]=am.getKey();
    c++;
}
       }
       return arr;
    }
}
