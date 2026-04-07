class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sword=new String(c);
            if(!m.containsKey(sword)){
m.put(sword,new ArrayList<>());
            }
            m.get(sword).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
