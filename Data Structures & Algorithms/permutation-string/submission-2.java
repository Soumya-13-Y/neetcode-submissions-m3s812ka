class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(isAnagram(s1,s2.substring(i,i+s1.length()))){
                return true;
            }
        }
        return false;
    }
    boolean isAnagram(String a,String b){
        int[] ch=new int[27];
        for(int i=0;i<a.length();i++){
            ch[a.charAt(i)-'a']++;
        }
         for(int i=0;i<b.length();i++){
            ch[b.charAt(i)-'a']--;
        }
         for(int i=0;i<27;i++){
            if(ch[i]>0 || ch[i]<0){
                return false;
            }
        }
        return true;
    }
}
