class Solution {
    public int lengthOfLongestSubstring(String s) {
       int len=0;
       int maxlen=0;
       for(int i=0;i<s.length();i++){
        int[] hasharr=new int[256];
        for(int j=i;j<s.length();j++){
            if(hasharr[s.charAt(j)]==1){
                break;
            }
            len=j-i+1;
            maxlen=Math.max(len,maxlen);
            hasharr[s.charAt(j)]++;
        }
       }
       return maxlen;
    }
}
