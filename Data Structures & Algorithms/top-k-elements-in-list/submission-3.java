class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        int c=0;
       Map<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
       }
      PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
      for(Map.Entry<Integer,Integer> am:m.entrySet()){
        pq.add(am);
        if(pq.size()>k){
            pq.poll();
        }
      }
       while (!pq.isEmpty()) {
            arr[c++] = pq.poll().getKey();
        }
       return arr;
    }
}
