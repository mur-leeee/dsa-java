import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> seen = new HashMap<>();

        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            seen.put(c, seen.getOrDefault(c, 0) + 1);
        }

        // Reduce count using t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!seen.containsKey(c)) {
                return false;
            }

            seen.put(c, seen.get(c) - 1);

            if (seen.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}
