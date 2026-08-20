class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
           map.put(nums[i], map.getOrDefault(nums[i], 0)+ 1);
        }

        int count = n+1;

        List<Integer>[] list = new List[count];

        for (int key: map.keySet()) {
            int freq = map.get(key);
            if (list[freq]==null) {
                list[freq] = new ArrayList<Integer>();
            }
            list[freq].add(key);
        }
        int[] ans = new int[k];
        int index = 0;

        for (int i=n; i>=0; i--) {
            if (list[i]==null) { continue;}

            for (int l : list[i]) {
                ans[index] = l;
                index++;
                if (index==k) break;
            }
                if (index==k) break;

        }

        return ans;
    }
}


