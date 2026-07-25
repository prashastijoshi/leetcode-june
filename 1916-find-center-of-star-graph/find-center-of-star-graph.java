class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            freq.put(u,freq.getOrDefault(u,0)+1);
            freq.put(v,freq.getOrDefault(v,0)+1);
            if(freq.get(u)==n){
                return u;
            }
            if(freq.get(v)==n){
                return v;
            }
        } 
        return -1;
        
    }
}