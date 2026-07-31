class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> numbers=new HashMap<>();
        for(int i:nums){
            if(numbers.get(i)!=null){
                return true;
            }
            numbers.put(i,1);
        }
        return false;
    }
}