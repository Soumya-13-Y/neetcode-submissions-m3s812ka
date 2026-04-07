class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
       int minlen=Integer.MAX_VALUE;int start=0;
       for(int i=0;i<s.length();i++){
        int[] arr=new int[256];
        int count=0;
        for(int j=0;j<t.length();j++){
            arr[t.charAt(j)]++;
        }
           for(int j=i;j<s.length();j++){
            if(arr[s.charAt(j)]>0){
                count++;
            }
              arr[s.charAt(j)]--;
              if(count==t.length()){
                 if(j - i + 1 < minlen){
                        minlen = j - i + 1;
                        start = i;
                    }
                break;
              }
           }
       }
         return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
