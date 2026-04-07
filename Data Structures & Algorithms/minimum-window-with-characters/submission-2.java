class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
       int minlen=Integer.MAX_VALUE;int start=0;
      
        int[] arr=new int[256];
        int count=0;
        for(int j=0;j<t.length();j++){
            arr[t.charAt(j)]++;
        }
        int left=0;int right=0;
           while(right<s.length()){
            if(arr[s.charAt(right)]>0){
                count++;
            }
              arr[s.charAt(right)]--;

              while(count==t.length()){
                 if(right - left + 1 < minlen){
                        minlen = right - left + 1;
                        start = left;
                    }
                arr[s.charAt(left)]++;
                if(  arr[s.charAt(left)]>0){
                    count--;
                }
                left++;
               
              }
              right++;
           }
       
         return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
