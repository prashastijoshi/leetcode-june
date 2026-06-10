class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = 0;

        while(l<=r){
            int k = (l+r)/2;

            int hours = 0;
            for(int p : piles){
                hours+= Math.ceil((double)p/k);
            }

            if(hours<=h){
                r = k-1;
                res = k;
            }
            else{
                l = k+1;
            }
        }
        return res;

        
    }
}