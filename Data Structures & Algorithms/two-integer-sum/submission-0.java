class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[j]==target-x){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
}
