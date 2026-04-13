class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
while(!s.isEmpty()&& nums[s.peek()]>nums[i]){
    int nse=i;
    int curr= (int) s.pop();
   int pse = s.isEmpty() ? -1 : s.peek();
  int area=nums[curr]*(nse-pse-1);
    max=Math.max(area,max);
}  s.push(i);

        }
        int nse=s.peek()+1;
        while(!s.isEmpty()){
       int curr= (int) s.pop();
   int pse = s.isEmpty() ? -1 : s.peek();
            int area=nums[curr]*(nse-pse-1);
    max=Math.max(area,max);
        }
        return max;
    }
  
}
