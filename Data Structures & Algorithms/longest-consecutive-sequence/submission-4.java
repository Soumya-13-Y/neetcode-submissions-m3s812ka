class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
      int count=1;
      int max=1;
    HashSet<Integer> h=new HashSet<>();
    for(int i:nums){
        h.add(i);
    }
    for(Integer a:h){
        if(!(h.contains(a-1))){
            count=1;
            int curr=a;
            while(h.contains(curr+1)){
                curr++;
                count++;
            }
        
   
            max=Math.max(count,max);}
    }
    
      return max;
    }
}
