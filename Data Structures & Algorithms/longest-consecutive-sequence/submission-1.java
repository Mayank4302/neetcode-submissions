class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int max=0;
        for (int num : nums) {
            map.put(num, false);
        }
        for (int num : nums) {
            if (!map.containsKey(num - 1)) {
                map.put(num, true);
            }
        }
        for (int num : map.keySet()) {
            int count = 0;
            if (map.get(num)) {
                int n = num;
                while (map.containsKey(n)) {
                    n++;
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}