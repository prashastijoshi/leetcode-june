// class Solution {
//     public int romanToInt(String s) {
//         Map<Character,Integer> maps = new HashMap<>();
//         maps.put('I',1);
//         maps.put('V',5);
//         maps.put('X',10);
//         maps.put('L',50);
//         maps.put('C',100);
//         maps.put('D',500);
//         maps.put('M',1000);

//         int result = 0;
//         // char[] nums = s.toCharArray();
//         for(int i = 0;i<s.length(); i++){
//             if(i+1 < s.length() && maps.get(s.charAt(i)) < maps.get(s.charAt(i+1))){
//                 result-=maps.get(s.charAt(i));
//             }
//             else{
//                 result+=maps.get(s.charAt(i));
//             }
//         }
//         // result+=maps.get(nums[s.length()-1]);
//         return result;
        
        
//     }
// }
public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1); roman.put('V', 5);
        roman.put('X', 10); roman.put('L', 50);
        roman.put('C', 100); roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }
        return res;
    }
}