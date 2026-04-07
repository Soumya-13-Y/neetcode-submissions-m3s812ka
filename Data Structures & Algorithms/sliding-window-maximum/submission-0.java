class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
        int c=0;
        int left=0;
        while(left<=nums.length-k){
            int max=Integer.MIN_VALUE;
            for(int i=left;i<left+k;i++ ){
                max=Math.max(nums[i],max);
            }
            result[c++]=max;
            left++;
        }
        return result;
    }
}
