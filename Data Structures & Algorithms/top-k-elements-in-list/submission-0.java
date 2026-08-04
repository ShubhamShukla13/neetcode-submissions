class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.merge(n, 1, Integer::sum);   // actually increments

        List<Integer>[] buckets = new List[nums.length + 1];  // bucket[i] = nums with frequency i
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (buckets[count] == null) buckets[count] = new ArrayList<>();
            buckets[count].add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int count = buckets.length - 1; count >= 1 && idx < k; count--) {
            if (buckets[count] == null) continue;
            for (int num : buckets[count]) {
                result[idx++] = num;
                if (idx == k) break;
            }
        }
        return result;
    }
}