class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;
        // int realSum = (n)*(n+1)/2;
        // for(int i = 0;i<n; i++){
        //     realSum-=nums[i];
        // }

        // return n-realSum;


        int slow =0;
        int fast = 0;
        while(true){
            slow=nums[slow];
            fast = nums[nums[fast]];

            if(slow==fast){
                break;
            }
        }
        int slow2 =0;
        while(true){
            slow = nums[slow];
            slow2=nums[slow2];
            if(slow==slow2){
                break;
            }
        }
        return slow;
        
    }
}