class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        int a=0;
     Map<Integer,Integer> m=new HashMap<>();
     for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
     }
List<Integer>[] bucket = new ArrayList[nums.length + 1];
for(Map.Entry<Integer,Integer> am:m.entrySet()){
     if(bucket[am.getValue()]==null){
bucket[am.getValue()]=new ArrayList<>();
        }
    bucket[am.getValue()].add(am.getKey());
}
for(int i=bucket.length-1;i>=0;i--){
     if(bucket[i]!=null){
for(Integer s:bucket[i]){
    if(a==k){
        break;
    }
    res[a]=s;
    a++;
}}
}
return res;
    }
}
