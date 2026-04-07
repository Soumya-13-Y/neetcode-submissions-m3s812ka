class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr=new ArrayList<>();
        Map<String,List<String>> m=new HashMap();
        for(int i=0;i<strs.length;i++){
            int[] ch=new int[27];
            for(int j=0;j<strs[i].length();j++){
                ch[strs[i].charAt(j)-'a']++;
            }
            StringBuilder s=new StringBuilder();
            String key=null;
            for(int j=0;j<ch.length;j++){
               s.append(ch[j]).append("#");
            }
            key=s.toString();
          if( m.containsKey(key)){
            m.get(key).add(strs[i]);
          }else{
            m.put(key,new ArrayList<>(List.of(strs[i])));
          }

        }
        arr.addAll(m.values());
        return arr;
    }
}
