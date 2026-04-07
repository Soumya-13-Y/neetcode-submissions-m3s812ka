class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preProductForward=new int[nums.length+1];
preProductForward[0]=1;
        for(int i=1;i<=nums.length;i++){
            preProductForward[i]=preProductForward[i-1]*nums[i-1];
        }

              int[] preProductReverse =new int[nums.length+1];
preProductReverse[nums.length]=1;
        for(int i=nums.length-1;i>=0;i--){
            preProductReverse[i]=preProductReverse[i+1]*nums[i];
        }

        int[] output=new int[nums.length];
        for(int i=1;i<=nums.length;i++){
            output[i-1]=preProductForward[i-1]*preProductReverse[i];
        }
return output;
    }
}  
