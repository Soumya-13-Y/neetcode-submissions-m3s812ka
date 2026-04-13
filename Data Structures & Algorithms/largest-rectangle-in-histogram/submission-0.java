class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
while(!s.isEmpty()&& nums[s.peek()]>nums[i]){
    int nse=i;
    int pse=calculatePse(s);
  int area=nums[s.peek()]*(nse-pse-1);
  s.pop();
    max=Math.max(area,max);
}  s.push(i);

        }
        int nse=s.peek()+1;
        while(!s.isEmpty()){
        int    pse=calculatePse(s);
            int area=nums[s.peek()]*(nse-pse-1);
            s.pop();
    max=Math.max(area,max);
        }
        return max;
    }
    int calculatePse(Stack s){
        int temp1=(int)s.pop();
        if(!s.isEmpty()){
        int temp=(int)s.pop();
        s.push(temp);
        s.push(temp1);
        return temp;
        }else{
        s.push(temp1);
             return -1;
        }
    }
}
