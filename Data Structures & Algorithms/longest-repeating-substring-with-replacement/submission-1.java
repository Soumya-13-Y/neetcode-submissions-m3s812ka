class Solution {
    public int characterReplacement(String s, int k) {
        int len=0;int maxlen=0;
        for(int i=0;i<s.length();i++){
          int[] arr=new int[27];
          int maxf=0;
            for(int j=i;j<s.length();j++){
               arr[s.charAt(j)-'A']++;
               maxf=Math.max(maxf,arr[s.charAt(j)-'A']);
               int change=(j-i+1)-maxf;
               if(change<=k){
                maxlen=Math.max(maxlen,j-i+1);
               }else{
                break;
               }
            }
            
        }
        return maxlen;
    }
}
