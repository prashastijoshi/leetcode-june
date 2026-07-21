class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int stone:stones){
            maxHeap.offer(-stone);
        }
        while(maxHeap.size()>1){
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if(first!=second){
                maxHeap.offer(-Math.abs(first-second));
            }

        }
        if(maxHeap.size()==1){
            return -maxHeap.peek();
        }
        return 0;
        

        
    }
}