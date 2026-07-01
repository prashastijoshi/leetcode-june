class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";

        Arrays.sort(strs);
        String w1 = strs[0];
        String w2 = strs[strs.length-1];
        if(w1.length()==0 || w2.length()==0)return result;
        // int i = 0;
        for(int i = 0;i<Math.min(w1.length(),w2.length()); i++){
            if(w1.charAt(i) != w2.charAt(i)){
                return result;
            }
            result = result +w1.charAt(i);
        
            // i++;
        }


        return result;
        
    }
}