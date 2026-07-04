class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int n = word1.length();
        int m = word2.length();
        String result="";
        while(i<n && j<m){
            result+=word1.charAt(i);
            result+=word2.charAt(j);
            i++;
            j++;
        }
        if(i<n){
            result+=word1.substring(i,n);
        }
        if(j<m){
            result+=word2.substring(j,m);
        }
        return result;
        
    }
}