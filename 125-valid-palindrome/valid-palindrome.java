class Solution {
    public boolean isPalindrome(String s) {
        String check = s.toLowerCase().trim().replaceAll("[^a-z0-9]","");
        System.out.println(check);
        int i = 0;
        int j = check.length()-1;
        while(i<j){
            if(check.charAt(i)!=check.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}