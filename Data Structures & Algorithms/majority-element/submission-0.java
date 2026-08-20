class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return nums[(int)Math.floor(n/2)];
    }
}