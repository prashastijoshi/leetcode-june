class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> maps = new HashMap<>();
        maps.put('(',')');
        maps.put('[',']');
        maps.put('{','}');

        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty() && maps.get(stack.pop()) == ch){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}