// class Solution {
//     public boolean validPalindrome(String s) {
//         int l =0,r=s.length()-1;
//         while(l<r){
//             if(s.charAt(l) != s.charAt(r)){
//                 return isPalindrome(s.substring(0,l)+s.substring(l+1)) || isPalindrome(s.substring(0,r)+s.substring(r+1));
                

//             }
//             l++;
//             r--;
//         }
//         return true;

        
//     }
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
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s.substring(0, l) + s.substring(l + 1)) ||
                       isPalindrome(s.substring(0, r) + s.substring(r + 1));
            }
            l++;
            r--;
        }

        return true;
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}