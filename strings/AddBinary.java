class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 && j >= 0){
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(j) - '0';
            sum = bitA + bitB + carry;
            sb.append(sum%2);
            carry = sum / 2;
            i--;
            j--;
        }
        while(i>=0){
            int bitA = a.charAt(i) - '0';
            sum = bitA + carry;
            sb.append(sum%2);
            carry = sum / 2;
            i--;
        }
        while(j>=0){
            int bitB = b.charAt(j) - '0';
            sum = bitB + carry;
            sb.append(sum%2);
            carry = sum / 2;
            j--;
        }
        if(carry > 0){
            sb.append(carry);
        }
        sb.reverse();
        String S = sb.toString();
        return S;
    }
}
