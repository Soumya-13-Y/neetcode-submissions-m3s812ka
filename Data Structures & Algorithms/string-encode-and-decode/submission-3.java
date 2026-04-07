class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> s=new ArrayList<>();
         int i=0;
         int j=0;
        while(i<str.length()){
    j=i;
       while(str.charAt(j)!='#'){
        j++;
       }
       int len=Integer.parseInt(str.substring(i,j));
       j++;
       String word=str.substring(j,j+len);
       s.add(word);
       i=j+len;
       }
return s;
    }
}
