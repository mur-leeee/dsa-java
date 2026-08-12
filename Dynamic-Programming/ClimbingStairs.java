class Solution {
    public int climbStairs(int n) {
        List<Integer> arr = new ArrayList<>();
        if(n == 1){
            return 1;
        }
        arr.add(1);
        arr.add(2);

        for(int i = 2 ; i < n ; i++){
            int sum = arr.get(i-1) + arr.get(i-2);
            arr.add(sum);
        }

        return arr.getLast();
    }
}
