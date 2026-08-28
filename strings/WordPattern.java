class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> seen = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0 ; i < words.length ; i++){
            String st = words[i];
            char ch = pattern.charAt(i);
            if(seen.containsKey(ch)){
                if(!seen.get(ch).equals(st)){
                    return false;
                }
            }

            else{
                if(seen.containsValue(st)){
                    return false;
                }
                else{
                    seen.put(ch, st);
                }
            }
        }
        return true;
    }
}
