class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxlength = 0;
        int maxFreq = 0;
        int hash[] = new int[26];
        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);
            if (((r - l) + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;
                maxFreq = 0;
                
                l++;
            }
            if ((r - l + 1) - maxFreq <= k) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
            r++;
        }
        return maxlength;
    }
}
