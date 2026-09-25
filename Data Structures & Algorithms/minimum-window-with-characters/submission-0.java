class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        String min = "";
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }
        int j = 0;
        int i = 0;

        while (j < s.length()) {
            smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 0) + 1);

            while (i <= j && compare(smap, tmap)) {
                if (min.isEmpty() || min.length() > j - i + 1) {
                    min = s.substring(i, j + 1);
                }
                Character ch = s.charAt(i);

                if (smap.get(ch) == 1) {
                    smap.remove(ch);
                } else {
                    smap.put(ch, smap.get(ch) - 1);
                }

                i++;
            }

            j++;
        }
        return min;
    }
    private boolean compare(Map<Character, Integer> smap, Map<Character, Integer> tmap) {
        for (Character ch : tmap.keySet()) {
            if (!smap.containsKey(ch))
                return false;

            if (smap.get(ch) < tmap.get(ch))
                return false;
        }
        return true;
    }
}
