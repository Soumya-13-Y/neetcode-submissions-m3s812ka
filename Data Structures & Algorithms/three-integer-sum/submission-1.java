class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
          int a=nums[i];
          if(i>0 && nums[i]==nums[i-1]){
            continue;
          }
          int left=i+1;
          int right=nums.length-1;
          while(left<right){
int sum=nums[left]+nums[right]+a;
if(sum>0){
  right--;
}else if(sum<0){
  left++;
}if(sum==0){
List<Integer> s=new ArrayList<>();
s.add(a);
s.add(nums[left]);
s.add(nums[right]);
 l.add(s);
 left++;
 right--;
 while(left<right && nums[left]==nums[left-1]){
                    left++;
                   }
}

          }
         
        }
        return l;
    }
}
