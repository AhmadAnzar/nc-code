class Solution {
    public void swap(int[] arr, int a, int b) {
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int i =0;
        int r = n-1;

        while (i<=r) {
            if (nums[i]==0) {
                swap(nums, l, i);
                l++;
            }
           else if (nums[i]==1) {
            }
            else if (nums[i]==2) {
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }
}
