class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums,0,subset,res);
        return res;
        
        
    }
    public void backtrack(int[] nums,int start, List<Integer> subset, List<List<Integer>> res){
        res.add(new ArrayList<>(subset));
        for(int i = start;i<nums.length;i++){
            subset.add(nums[i]);
            backtrack(nums,i+1,subset,res);
            subset.remove(subset.size()-1);
        }
        return; 

    }
}