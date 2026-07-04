class Solution {
    public String addBinary(String a, String b) {
        // long na = Long.parseLong(a,2);
        // long nb = Long.parseLong(b,2);
        // return Long.toBinaryString(na+nb);

        // String ar = new StringBuilder(a).reverse().toString();
        // String br = new StringBuilder(b).reverse().toString();
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 || j>=0 || carry>0){
            int digita = i>=0?a.charAt(i)-'0':0;
            int digitb = j>=0?b.charAt(j)-'0':0;
            int total = digita+digitb+carry;
            // char c = (char)(total%2 +'0');
            result.append(total%2);
            carry  = total/2;

            i--;
            j--;
        }
        if(carry>0){
            result.append('1');
        }
        return result.reverse().toString();
        
    }
}