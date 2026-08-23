class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int c = (int) Math.floor(n/3); 
        c++;
        List<Integer> ans = new ArrayList<>();

       HashMap<Integer, Integer> map = new HashMap<>();
       for (int i=0;i<n;i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
       }

       for (int key : map.keySet()) {
        if (map.get(key)>=c) {
            ans.add(key);
        }
       }
       return ans;

    }
}
