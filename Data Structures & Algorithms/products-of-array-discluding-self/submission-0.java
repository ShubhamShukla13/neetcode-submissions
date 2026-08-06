class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int []left=new int[len];
        int []right=new int[len];
        int temp=1;
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i]*left[i-1];
        }
        right[len-1]=nums[len-1];
        for(int i=len-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }
        int[] ans=new int[nums.length];
        for(int i=1;i<nums.length-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
        ans[0]=right[1];
        ans[len-1]=left[len-2];
        return ans;
    }
}  
