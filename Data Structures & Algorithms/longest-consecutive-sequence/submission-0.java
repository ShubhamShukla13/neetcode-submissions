class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
        }
        int count=0;
        for(Integer key:map.keySet()){
            int k=key;
            if(map.containsKey(k-1))continue;
            int i=1;
            while(true){
                if(map.containsKey(k+i)){
                    i++;
                }else{
                    break;
                }
            }
            count=Math.max(count,i);
        }
        return count;
    }
}

