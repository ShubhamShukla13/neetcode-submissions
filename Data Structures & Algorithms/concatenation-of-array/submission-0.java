class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []ans=new int[n*2];
        int i=0;
        for(int k:nums){
            ans[i]=k;
            ans[i+n]=k;
            i++;
        }
        return ans;
    }
}