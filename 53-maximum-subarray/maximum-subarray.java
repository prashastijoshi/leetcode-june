class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int maxSum=nums[0];
        int currSum=0;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<=0){
                currSum=0;
            }
            
            
            

        }
        return maxSum;
        
    }
}