class Solution {
    private final String code="#%$#";
    public String encode(List<String> strs) {
        StringBuilder ans=new StringBuilder();
        for(String ab:strs){
            ans.append(ab).append(code);
         }
        return ans.toString();
    }

    public List<String> decode(String str) {
        StringBuilder temp=new StringBuilder();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            if(temp.length()>=4){
                String t=temp.substring(temp.length()-4);
                if(t.equals(code)){
                    String k=temp.substring(0,temp.length()-4);
                    ans.add(k);
                    temp=new StringBuilder();
                }
            }
        }
        return ans;
    }
}
