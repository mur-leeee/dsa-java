class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();
        while(right < s.length()){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(seen.contains(r)){
                seen.remove(l);
                left++;
            }
            else{
                seen.add(r);
                maxlen = Math.max(maxlen, right - left + 1);
                right++;
            }
        }
        return maxlen;
    }
}
