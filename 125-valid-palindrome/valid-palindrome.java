// class Solution {
//     public boolean isPalindrome(String s) {
//         String check = s.toLowerCase().trim().replaceAll("[^a-z0-9]","");
//         System.out.println(check);
//         int i = 0;
//         int j = check.length()-1;
//         while(i<j){
//             if(check.charAt(i)!=check.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
        
//     }
// }
public class Solution {
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