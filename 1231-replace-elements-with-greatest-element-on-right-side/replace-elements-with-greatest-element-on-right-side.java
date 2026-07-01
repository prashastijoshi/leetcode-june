class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int currMax = -1;
        
        for(int i = n-1; i>=0; i--){
            result[i] = currMax;
            currMax = Math.max(currMax,arr[i]);
            // if(i==n-1)continue;
            
            
        }
        return result;
        
    }
}