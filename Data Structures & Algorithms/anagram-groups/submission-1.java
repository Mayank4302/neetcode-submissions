class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key= freqStr(strs[i]);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> str=new ArrayList<>();
                str.add(strs[i]);
                map.put(key,str);
            }
        }
        ans.addAll(map.values());
        return ans;
    }

    private String freqStr(String str) {
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sb.append(i + 'a');
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
