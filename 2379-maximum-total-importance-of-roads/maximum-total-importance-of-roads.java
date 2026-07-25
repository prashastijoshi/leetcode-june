class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree = new long[n];
        for(int[] edge:roads){
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        Arrays.sort(degree);

        long res=0;
        long importance = 1;
        for(int i=0;i<n;i++){
            res+=degree[i]*importance;
            importance++;
        }
        return res;
        
    }
}