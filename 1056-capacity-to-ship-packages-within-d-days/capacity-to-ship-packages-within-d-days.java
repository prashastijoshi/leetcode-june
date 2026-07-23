class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l =0;
        int r = 0;
        for(int w:weights){
            l = Math.max(l,w);
            r+=w;
        }
        int res = r;
        while(l<=r){
            int cap = (l+r)/2;
            if(canShip(weights, days, cap)){
                res = Math.min(cap,res);
                r = cap-1;
            }
            else{
                l = cap+1;
            }
        }
        return res;
        
    }
    public boolean canShip(int[] weights, int days, int cap){
        int ships =1;
        int currcap=cap;
        for(int w:weights){
            if(currcap-w <0){
                ships++;
                if(ships>days){
                    return false;
                }
                currcap = cap;
            }
            currcap-=w;
        }
        return true;
    }
}