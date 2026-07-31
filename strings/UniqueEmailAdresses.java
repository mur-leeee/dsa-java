class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<>();
        int a = 0;
        int p = 0;
        int n = 0;
        for(String S : emails){
            StringBuilder sb = new StringBuilder(S);
            int i = 0;
            while(i < sb.length()){
                char ch = sb.charAt(i);
                if(ch == '@'){
                    a = 1;
                    i++;
                }
                else if(ch == '+' && p == 0){
                    p = 1;
                    sb.deleteCharAt(i);
                }
                else if(ch == '.' && a == 0){
                    sb.deleteCharAt(i);
                }
                else if(p == 1 && a == 0){
                    sb.deleteCharAt(i);
                }
                else if(a == 1){
                    break;
                }
                else{
                    i++;
                }
            }
            a = 0;
            p = 0;
            hs.add(sb.toString());
        }
        return hs.size();
    }
}
