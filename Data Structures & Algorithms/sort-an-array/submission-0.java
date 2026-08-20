class Solution {

    public void quickSort (int[] arr, int low, int high) {
        if (low<high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public int partition  (int [] arr, int low, int high) {
            int pivot = arr[high];

            int i = low;
            for (int j=low; j<high; j++) {
                if (arr[j]<pivot) {
                    swap(arr, i, j);
                    i++;
                }
            }
            swap(arr, i, high);

            return i;
    }

    public void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}