class Solution {
    public boolean hasDuplicate(int[] nums) {
 Map<Integer,Integer> m=new HashMap<Integer,Integer>();
 for(int i=0;i<nums.length;i++){
    m.put(nums[i],m.getOrDefault(nums[i],0)+1);
 }

 for(Map.Entry<Integer,Integer> a:m.entrySet()){
    if(a.getValue()>1){
        return true;
    }
 }
 return false;
    }
}
