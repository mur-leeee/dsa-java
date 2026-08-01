class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> seen = new HashMap<>();

        for(char ch : s.toCharArray()){
            seen.put(ch, seen.getOrDefault(ch, 0)+ 1);
        }

        for(char c : t.toCharArray()){
            if(! seen.containsKey(c)){
                return c;
            }
            
            if(seen.get(c)==  0){
                return c;
            }
            else{
                seen.put(c, seen.get(c) - 1);
            }
        }
        return ' ';
    }
}
