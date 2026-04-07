class Solution {
    public int[] productExceptSelf(int[] nums) {
int[] prefix=new int[nums.length+1];
prefix[0]=1;
for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]*nums[i-1];

}
int[] postfix=new int[nums.length+1];
postfix[nums.length]=1;
for(int i=postfix.length-2;i>=0;i--){
    postfix[i]=postfix[i+1]*nums[i];
}

int[] result=new int[nums.length];
for(int i=1;i<=nums.length;i++){
    result[i-1]=postfix[i]*prefix[i-1];
}
return result;
    }
}  
