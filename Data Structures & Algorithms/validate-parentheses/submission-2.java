class Solution {
   public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for(char ch : s.toCharArray()){

        if(ch == '(') stack.offerLast(')');
        else if(ch == '{') stack.offerLast('}');
        else if(ch == '[') stack.offerLast(']');
        else{
            if(stack.isEmpty() || stack.pollLast() != ch){
                return false;
            }
        }
    }

    return stack.isEmpty();
}
}
