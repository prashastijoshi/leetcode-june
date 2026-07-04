class Solution {
    public String addBinary(String a, String b) {
        // long na = Long.parseLong(a,2);
        // long nb = Long.parseLong(b,2);
        // return Long.toBinaryString(na+nb);

        String ar = new StringBuilder(a).reverse().toString();
        String br = new StringBuilder(b).reverse().toString();
        StringBuilder result = new StringBuilder();

        int carry = 0;
        for(int i = 0; i<Math.max(a.length(),b.length()); i++){
            int digita = i<ar.length()?ar.charAt(i)-'0':0;
            int digitb = i<br.length()?br.charAt(i)-'0':0;
            int total = digita+digitb+carry;
            char c = (char)(total%2 +'0');
            result.append(c);
            carry  = total/2;
        }
        if(carry>0){
            result.append('1');
        }
        return result.reverse().toString();
        
    }
}