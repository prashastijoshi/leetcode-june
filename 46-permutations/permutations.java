class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        boolean[] pick = new boolean[nums.length];
        backtrack(nums,0,subset,pick);
        return res;
    }
    public void backtrack(int[] nums, int start, List<Integer> subset, boolean[] pick){
        if(subset.size()==nums.length){
            res.add(new ArrayList<>(subset));
        }
        for(int i = 0;i<nums.length;i++){
            if(!pick[i]){
                pick[i]=true;
                subset.add(nums[i]);
                backtrack(nums,i+1,subset,pick);
                subset.remove(subset.size()-1);
                pick[i]=false;

            }
            
        }
        return;
    }
}