class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> a= new ArrayList<>();
       int sum=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
            int left=i+1;
       int right=nums.length-1;
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        while(left<right){
             sum=nums[i]+nums[left]+nums[right];
             if(sum<0){
left++;
             }else if(sum>0){
               right--;
             }else{
                List<Integer> l=new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[left]);
                l.add(nums[right]);
                a.add(l);
                left++;
                right--;
                while(left<right && nums[left-1]==nums[left]){
                    left++;
                }
             }
        }
       } 
       return a;
    }
}
