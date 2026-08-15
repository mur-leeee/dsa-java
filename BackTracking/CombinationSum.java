class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] cand, int tar, int start, List<Integer> curr, List<List<Integer>> res){
        if(tar == 0){
            res.add(new ArrayList<>(curr));
            return ;
        }

        if(tar < 0){
            return ;
        }

        for(int i = start ; i < cand.length ; i++){
            curr.add(cand[i]);
            backtrack(cand, tar - cand[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
