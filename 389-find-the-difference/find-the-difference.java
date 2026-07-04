class Solution {
    public char findTheDifference(String s, String t) {
        int ss = 0;
        int ts = 0;
        int i=0;
        while(i<s.length()){
            ss+= s.charAt(i);
            ts+=t.charAt(i);
            i++;
        }
        ts+=t.charAt(i);
        return (char)(ts-ss);

        
    }
}