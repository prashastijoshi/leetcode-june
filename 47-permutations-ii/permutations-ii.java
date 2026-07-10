class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> subset = new ArrayList<>();
    private boolean[] picked ;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        picked = new boolean[nums.length];
        backtrack(nums,picked);
        return res;
    }
    public void backtrack(int[] nums, boolean[] picked){
        if(subset.size()==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(picked[i] || (i>0 && nums[i] == nums[i-1] && !picked[i-1])){
                continue;
            }
            picked[i] = true;
            subset.add(nums[i]);
            backtrack(nums,picked);
            picked[i] = false;
            subset.remove(subset.size()-1);
            
        }
        return;
    }
}