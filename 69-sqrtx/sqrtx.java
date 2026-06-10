class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        long result = 0;
        while(l<=r){
            long k = l+(r-l)/2;
            long sqr = k*k;
            if(sqr>x){
                r=k-1;
            }
            else if(sqr==x){
                return (int)k;
            }
            else{
                l=k+1;
                result = Math.max(k,result);
                
            }
        }
        return (int)result;
        
    }
}