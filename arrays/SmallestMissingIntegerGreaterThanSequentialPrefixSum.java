class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        
        int sum = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        if(! seen.contains(sum)){
            return sum;
        }
        else{
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < min ; j++){
                sum+=1;
                if(! seen.contains(sum)){
                    break;
                }
            }
        }
        return sum;
    }
}
