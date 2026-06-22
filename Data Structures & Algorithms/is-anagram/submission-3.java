class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    char[] ab=s.toCharArray();
    Arrays.sort(ab);
    char[] cd=t.toCharArray();
    Arrays.sort(cd);
     String a=new String(ab);
     String b=new String(cd);
     return a.equals(b);
    }
}
