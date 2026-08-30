class Solution {
    public int minimumDeletions(int[] nums) {
        int minv= Integer.MAX_VALUE;
        int maxv = Integer.MIN_VALUE;
        int maxi = 0;
        int mini = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > maxv){
                maxv = nums[i];
                maxi = i;
            }

            if(nums[i] < minv){
                minv = nums[i];
                mini = i;
            }
        }

        int m = Math.max(maxi, mini);
        int n = Math.min(maxi, mini);

        int c1 = m + 1;
        int c2 = nums.length - n;
        int c3 =(n + 1) + (nums.length - m);

        int count = Math.min(c1, c2);
        count = Math.min(count, c3);

        return count;
    }
}
