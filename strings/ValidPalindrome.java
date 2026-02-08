class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(! Character.isLetterOrDigit(c)){
                i+=1;
                continue;
            }
            if(! Character.isLetterOrDigit(d)){
                j-=1;
                continue;
            }
            c=Character.toLowerCase(c);
            d=Character.toLowerCase(d);
            if(c!=d){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}
