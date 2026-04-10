class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
     Map<Integer,Integer> m=new HashMap<>();
     for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
     }
PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
for(Map.Entry<Integer,Integer> a:m.entrySet()){
    pq.add(a);
    if(pq.size()>k){
        pq.poll();
    }
}
  int index = 0;
        while (!pq.isEmpty()) {
            res[index++] = pq.poll().getKey();
        }
return res;
    }
}
