class Trie {
    HashMap<Character, Trie> trie;
    boolean isEnd;

    public Trie () {
        this.trie = new HashMap<>();
        this.isEnd = false;
    }

    public void insert(String s) {
        Trie curr = this;
        for (char c  : s.toCharArray()) {
            curr.trie.putIfAbsent(c, new Trie());
            curr = curr.trie.get(c);
        }
        curr.isEnd = true;
    }
    public String isLCP (String[] s) {
        for (String str : s) {
            insert(str);
        }
        StringBuilder sb = new StringBuilder();

        Trie curr = this;
        while (curr.isEnd!=true && curr.trie.size()==1) {
            Map.Entry<Character, Trie> entry = curr.trie.entrySet().iterator().next();
            sb.append(entry.getKey());
            curr = entry.getValue();
        }
        return sb.toString();
       
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Trie trie = new Trie();
        // trie.insert(strs);
        return trie.isLCP(strs);
        
    }
}