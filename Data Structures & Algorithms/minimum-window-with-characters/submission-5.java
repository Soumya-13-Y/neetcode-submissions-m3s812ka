class Solution {
    public String minWindow(String s, String t) {
 if(t.length()>s.length()){
    return"";
     }      
int min=Integer.MAX_VALUE;
int startI=0;
        for(int i=0;i<s.length();i++){
            int count=0;
              int[] arr=new int[256];
              for(int k=0;k<t.length();k++){
            arr[t.charAt(k)]++;
         }
            for(int j=i;j<s.length();j++){
            if(arr[s.charAt(j)]>0){
                count++;
            }
            arr[s.charAt(j)]--;
            if(count==t.length()){
                 if(j - i + 1 < min){
                        min = j - i + 1;
                        startI = i;
                    }
                break;
            }
            }
        }
        if(min!=Integer.MAX_VALUE){
        return s.substring(startI,startI+min);}
        else{
            return "";
        }
    }
}
