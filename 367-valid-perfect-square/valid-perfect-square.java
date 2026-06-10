class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0;
        long r = num;
        // int res = 0;
        while(l<=r){
            long k = l+(r-l)/2;
            long sqr = k*k;

            if(sqr>num){
                r=k-1;
            }
            else if(sqr<num){
                l=k+1;
                
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}