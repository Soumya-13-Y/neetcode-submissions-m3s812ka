class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        
        int[] arr=new int[k];
        while(c<k){
          int indx=0;
          int max=Integer.MIN_VALUE;
          for(Map.Entry<Integer,Integer> a:m.entrySet()){
int key=a.getKey();
int val=a.getValue();
if(val>=max){
indx=key;
max=val;
}
          }
          arr[c]=indx;
           m.put(indx,m.getOrDefault(indx,0)-m.getOrDefault(indx,0));
          c++;
        }
        return arr;
    }
}
