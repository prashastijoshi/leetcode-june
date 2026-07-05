class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> pairs = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        pairs.put('(',')');
        pairs.put('[',']');
        pairs.put('{','}');

        char[] chars = s.toCharArray();
        for(char ch: chars){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())return false;
                if(pairs.get(stack.pop())!=ch){
                    return false;
                };

            }

        }
        return(stack.isEmpty());
        // return true;
        
    }
}