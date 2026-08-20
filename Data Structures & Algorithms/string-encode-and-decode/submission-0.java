class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<strs.size(); i++) {
            int len = strs.get(i).length();
            sb.append(Integer.toString(len));
            sb.append("#");
            sb.append(strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if (str=="") return ans;
        int n = str.length();
        int i=0;
        while (i<n) {
        int index = str.indexOf("#", i);
            int len = Integer.valueOf(str.substring(i, index));
            ans.add(str.substring(index+1, index+len+1));

            i = index + len+ 1;
        }       
           
        return ans;
    }
}
// 5#Hello5#World
// 0123456789