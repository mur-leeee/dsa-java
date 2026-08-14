class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int left = 0;
        int max_size = 0;
        for(int right = 0 ; right < s.length() ; right++){
            char r = s.charAt(right);
            seen.put(r, seen.getOrDefault(r, 0) + 1);

            while(seen.get(r) > 2){
                char l = s.charAt(left);
                seen.put(l, seen.get(l) - 1);
                left+=1;
            }

            int size = right - left + 1;
            max_size = Math.max(max_size, size);
        }
        return max_size;

    }
}
