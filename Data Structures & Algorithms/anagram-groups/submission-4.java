class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){
            int[] a=new int[26];
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int i=0;i<26;i++){
             key.append(a[i]).append("#");
            }
m.computeIfAbsent(key.toString(),k->new ArrayList()).add(s);
        }

        return new ArrayList<>(m.values());
    }
}
