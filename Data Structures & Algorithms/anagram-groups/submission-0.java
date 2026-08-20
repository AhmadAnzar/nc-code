class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        int n = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            String s = strs[i];
            int[] freq = new int[26];
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        ans.addAll(map.values());
        return ans;


    }
}
