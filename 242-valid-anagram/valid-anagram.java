// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         Map<Character,Integer> sm = new HashMap<>();
//         Map<Character,Integer> tm = new HashMap<>();

//         for(int i = 0; i<s.length(); i++){
//             sm.put(s.charAt(i),sm.getOrDefault(s.charAt(i),0)+1);
//             tm.put(t.charAt(i),tm.getOrDefault(t.charAt(i),0)+1);
//         }
//         return(sm.equals(tm));
        
//     }
// }
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}