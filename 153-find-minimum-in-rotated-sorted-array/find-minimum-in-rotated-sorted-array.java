class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        
        //
        
        min = binarysearch(nums, low, high, min);
       


        return min;

        

            

        
    }

    public int binarysearch(int[] nums,int left, int right, int min){
       
        if(left> right){
            return min;
        }
        int mid = left+(right-left)/2;
        
        min = binarysearch(nums, left, mid-1, min);
        if(nums[mid]<min) min=nums[mid];
        min = binarysearch(nums, mid+1, right, min);
        if(nums[mid]<min) min=nums[mid];
        return min;


        
        
    }
}