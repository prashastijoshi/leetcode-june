class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String str:logs){
            if(str.equals("../")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(!str.equals("./")){
                stack.push(str);
            }
        }

        int count = 0;
        while(!stack.isEmpty()){
            stack.pop();
            count++;
        }
        return count;
    }
}