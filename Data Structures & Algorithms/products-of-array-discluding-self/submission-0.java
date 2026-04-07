class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=1;
        int[] arr=new int[nums.length];
         for(int i=0;i<arr.length;i++){
          arr[i]=c;
          c=c*nums[i];
        }
 c=1;

        for(int i=arr.length-1;i>=0;i--){
          arr[i]=arr[i]*c;
          c=c*nums[i];
        }
        return arr;
    }
}  
