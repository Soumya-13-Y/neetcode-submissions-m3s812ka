class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int a=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&& temperatures[stack.peek()]<temperatures[i]){
               int c=stack.pop();
                res[c]=i-c;
            }
            stack.push(i);
        }
        return res;
    }
}
