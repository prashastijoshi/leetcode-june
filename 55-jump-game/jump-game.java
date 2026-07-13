class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n+1];
        if(nums[0] ==0 && nums.length>1)return false;
        else if(nums.length==1) return true;
        dp[0] = true;
        // dp[1] = true;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && j+nums[j]>=i){
                    dp[i] = true;
                    break;
                }
                // dp[i] =false;
            }
            
        }  
        return dp[n-1];

        
    }
}