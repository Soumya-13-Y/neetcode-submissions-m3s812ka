class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> l=new ArrayList<>();
     boolean[] b=new boolean[strs.length];
  for(int i=0;i<strs.length;i++){
    List<String> anList=new ArrayList<>();
    for(int j=i+1;j<strs.length;j++){
        if(!b[j]){
        if(isAnagarm(strs[i],strs[j])){
anList.add(strs[j]);
b[j]=true;
        }}
    }
   if(!b[i]){
    anList.add(strs[i]);
     b[i]=true;
    l.add(anList);
    }
   
  }
  return l;
        
    }

    boolean isAnagarm(String a,String b){
        if(a.length() !=b.length()){
            return false;
        }
        int[] ch=new int[26];
        for(int i=0;i<a.length();i++){
            ch[a.charAt(i)-'a']++;
        }
           for(int i=0;i<b.length();i++){
            ch[b.charAt(i)-'a']--;
        }
          for(int i=0;i<ch.length;i++){
           if(ch[i]>0 || ch[i]<0){
            return false;
           }
        }
        return true;
    }
}
