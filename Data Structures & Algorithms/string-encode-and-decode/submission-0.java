class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = str.indexOf('#', i);

            int len = Integer.parseInt(str.substring(i, j));

            int k = j + 1;

            while (k < j + 1 + len) {
                k++;
            }

            ans.add(str.substring(j + 1, k));

            i = k;
        }
        return ans;
    }
}
