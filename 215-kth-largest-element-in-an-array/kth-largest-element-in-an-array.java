class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for(int i= 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count=0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count += entry.getValue();
           
            if (count >= k) {
                return entry.getKey();
            }
        }
        return -1;
    }
}