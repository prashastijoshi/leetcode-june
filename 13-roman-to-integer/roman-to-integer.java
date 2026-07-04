class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> maps = new HashMap<>();
        maps.put('I',1);
        maps.put('V',5);
        maps.put('X',10);
        maps.put('L',50);
        maps.put('C',100);
        maps.put('D',500);
        maps.put('M',1000);

        int result = 0;
        char[] nums = s.toCharArray();
        for(int i = 0;i<s.length(); i++){
            if(i+1 < s.length() && maps.get(nums[i]) < maps.get(nums[i+1])){
                result-=maps.get(nums[i]);
            }
            else{
                result+=maps.get(nums[i]);
            }
        }
        // result+=maps.get(nums[s.length()-1]);
        return result;
        
        
    }
}