class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int maxlen=0;
        int left=0;
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i))>=left){
                left=m.get(s.charAt(i))+1;
            }
            len=i-left+1;
            m.put(s.charAt(i),i);
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}
