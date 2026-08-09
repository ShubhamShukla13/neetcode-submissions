class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char st=s.charAt(start);
            char en=s.charAt(end);
            if(!isAlphaNumeric(st)){
                start++;
                continue;
            }
            if(!isAlphaNumeric(en)){
                end--;
                continue;
            }
            if(Character.toLowerCase(st)==Character.toLowerCase(en)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean isAlphaNumeric(char c){
        int ch=c+0;
        if((ch>=('a'-0) && ch<=('z'-0))||(ch>=('A'-0) && ch<=('Z'-0)) || (ch>='0'-0 && ch<='9'-0)) {
            return true;
        }else return false;
    }
}
