class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] map=new int[26];
        Map<String,List<String>> result=new HashMap<>();
        for(String str:strs){
            String key=calculateMap(str);
            result.computeIfAbsent(key,k->new ArrayList()).add(str);
        }
        return new ArrayList<>(result.values());
    }
    String calculateMap(String str){
        int []map=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map[ch-'a']++;
        }
        StringBuilder br=new StringBuilder();
        for(int k:map){
            br.append(k);
        }
        return br.toString();
    }
}
