class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m =new HashMap();
       for(String s:strs){
int[] arr=new int[27];
for(int i=0;i<s.length();i++){
    arr[s.charAt(i)-'a']++;
}
StringBuilder sb=new StringBuilder();
for(int i=0;i<arr.length;i++){
sb.append(arr[i]).append("#");
}
String key=sb.toString();
m.computeIfAbsent(key,k->new ArrayList()).add(s);

       } 
       return new ArrayList<>(m.values());
    }
}
