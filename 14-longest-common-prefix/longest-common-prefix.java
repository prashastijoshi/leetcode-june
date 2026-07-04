class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String w1 = strs[0];
        String w2 = strs[strs.length-1];
       
        for(int i = 0; i<Math.min(w1.length(),w2.length());i++){
            if(w1.charAt(i)!=w2.charAt(i)){
                return sb.toString();
            }
            sb.append(w2.charAt(i));
        }
        
        return sb.toString();
    }
}