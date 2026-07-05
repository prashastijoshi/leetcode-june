class Solution {
    public boolean validPalindrome(String s) {
        int l =0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(s.substring(0,l)+s.substring(l+1)) || isPalindrome(s.substring(0,r)+s.substring(r+1));
                

            }
            l++;
            r--;
        }
        return true;

        
    }
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}