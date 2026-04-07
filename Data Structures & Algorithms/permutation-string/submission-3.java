class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count=new int[26];
         int[] win=new int[26];
         for(int i=0;i<s1.length();i++){
           s1count[s1.charAt(i)-'a']++; 
         }
         int left=0;
         for(int i=0;i<s2.length();i++){
            win[s2.charAt(i)-'a']++;
            if(i-left+1>s1.length()){
                 win[s2.charAt(left)-'a']--;
                 left++;
            }
            if(Arrays.equals(s1count,win)){
                return true;
            }
         }
         return false;
    }
}
