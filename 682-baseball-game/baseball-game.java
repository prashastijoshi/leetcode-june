class Solution {
    private Stack<Integer> stack = new Stack<>();
    public int calPoints(String[] operations) {
        for(String str : operations){
            
            if(str.equals("+"))sumprev();
            else if(str.equals("D"))doubleprev();
            else if(str.equals("C"))remove();

            
            else newscore(str);
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
        

        
    }
    public void newscore(String x){
        int n = Integer.parseInt(x);
        stack.push(n);
    }
    public void sumprev(){
        int top = stack.pop();
        int nowpush = top+stack.peek();
        stack.push(top);
        stack.push(nowpush);

    }
    public void doubleprev(){
        stack.push(2*stack.peek());
    }
    public void remove(){
        stack.pop();
    }
}
