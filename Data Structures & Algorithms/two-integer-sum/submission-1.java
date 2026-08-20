class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                ans[1] = i;
                ans[0] = map.get(diff);
                return ans;
            }
        
            map.put(nums[i], i);
        }
        
         return ans;
    }
}

