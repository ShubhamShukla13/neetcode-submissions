class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end =numbers.length-1;
        while(start<end){
            int cur=numbers[start]+numbers[end];
            // System.out.println(cur +", start --"+start+", end "+end);
            if(cur<target){
                start++;
            }else if(cur>target){
                end--;
            }else{
                break;
            }
        }
        return new int[]{start+1,end+1};   
    }
}
