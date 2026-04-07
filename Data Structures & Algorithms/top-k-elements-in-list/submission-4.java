class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        int c=0;
       Map<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
       }
      List<Integer>[] bucket=new ArrayList[nums.length+1];
      for(Map.Entry<Integer,Integer> am:m.entrySet()){
        if(bucket[am.getValue()]==null){
bucket[am.getValue()]=new ArrayList<>();
        }
        bucket[am.getValue()].add(am.getKey());
      }
      for(int i=bucket.length-1;i>=0 && c<k ;i-- ){
       if(bucket[i]!=null){
            for (int num : bucket[i]) {
                    arr[c] = num;
                    c++;
                    if (c == k) break;
                }
        }
      }
       return arr;
    }
}
