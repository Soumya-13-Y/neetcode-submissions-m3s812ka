class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> s=new TreeSet<Integer>();
        for(int i: nums){
            s.add(i);
        }
      Integer[] arr=new Integer[nums.length];
      int c=0;
      for(Integer i:s){
arr[c]=i;
c++;
      }
      int len=0; int max=0;
      for(int i=0;i<nums.length-1;i++){
        if(arr[i] != null && arr[i+1] != null && (arr[i]+1)==(arr[i+1])){
            len++;
        }else{
            len=0;
        }
        max=Math.max(len,max);
      }
        return max+1;
    }
}
