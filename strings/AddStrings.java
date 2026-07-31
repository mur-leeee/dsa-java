class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while(i >= 0 && j >= 0){
            int bitA = num1.charAt(i) - '0';
            int bitB = num2.charAt(j) - '0';
            sum = bitA + bitB + carry;
            sb.append(sum%10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(i>=0){
            int bitA = num1.charAt(i) - '0';
            sum = bitA + carry;
            sb.append(sum% 10);
            carry = sum / 10;
            i--;
        }
        while(j>=0){
            int bitB = num2.charAt(j) - '0';
            sum = bitB + carry;
            sb.append(sum%10);
            carry = sum / 10;
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
