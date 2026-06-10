class Solution {
    public int arrangeCoins(int n) {
        int l = 0;
        int r = n;
        int res = 0;

        while(l<=r){
            int k = l+(r-l)/2;
            long coins= (long)k * (k+1)/2;

            if(coins>n){
                r=k-1;
            }
            else{
                l = k+1;
                res = Math.max(res,k);
            }

        }

        return res;


















        // int[] arr = new int[n/2+1];
        // arr[0] = 1;
        // for(int i = 1; i<arr.length; i++){
        //     arr[i] = arr[i-1] + i+1;
        // }

        // int l = 0;
        // int r = arr.length;
        // int res=0;

        // while(l<=r){
        //     int mid = (l+r)/2;

        //     if(arr[mid] == n){
        //         return mid+1;
        //     }
        //     else if(arr[mid] > n){
        //         r=mid-1;
        //     }
        //     else{
        //         l = mid+1;
        //         res=mid+1;
        //     }
        //     mid=(l+r)/2;
        // }
        // return res;
        
    }
}