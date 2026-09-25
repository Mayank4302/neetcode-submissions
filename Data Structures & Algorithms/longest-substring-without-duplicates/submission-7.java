class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        Set<Character> set = new HashSet<>();
        int ans=0;
        int i = 0;
        int j = i+1;
        set.add(s.charAt(i));
        while (j < s.length()) {
            if(set.contains(s.charAt(j))){
                while(i<j && set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));

            }else{
                set.add(s.charAt(j));
            }
            j++;
            ans= Math.max(ans,set.size());
        }
        return ans;
    }
}
