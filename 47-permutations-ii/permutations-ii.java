class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        boolean[] picked = new boolean[nums.length];
        backtrack(nums,subset,res,picked);
        return res;
        
    }
    public void backtrack(int[] nums, List<Integer> subset,List<List<Integer>> res, boolean[] picked){
        if(nums.length==subset.size()){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(picked[i] || (i>0 && nums[i] == nums[i-1] && !picked[i-1]) ){
                continue;
            }
       
            picked[i] =true;
            subset.add(nums[i]);
            backtrack(nums,subset,res,picked); 
            subset.remove(subset.size()-1);
            picked[i]=false; 

            
            
        }
        return;
    }
}