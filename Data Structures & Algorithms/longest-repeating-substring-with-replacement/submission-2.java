class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxf=0;
        int maxlen=0;
       int[] arr=new int[27];
        while(left<=right && right<s.length()){
arr[s.charAt(right)-'A']++;
maxf=Math.max(maxf,arr[s.charAt(right)-'A']);
while((right-left+1 )-maxf>k){
  arr[s.charAt(left)-'A']--;  
  maxf=0;
  for(int i=0;i<27;i++){
    maxf=Math.max(maxf,arr[i]);
  }
  left++;
}
maxlen=Math.max(maxlen,right-left+1);
right++;
        }
        return maxlen;
    }
}
