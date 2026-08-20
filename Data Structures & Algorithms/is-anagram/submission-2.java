class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n!=m) return false;

        int[] freq = new int[26];

        for (int i=0;i<n;i++) {
            char c = s.charAt(i);
            freq[c-'a']++;
            char d= t.charAt(i);
            freq[d-'a']--;
        }

        for (int e:freq) {
            if (e!=0) return false;
        }
        return true;
    }
}
