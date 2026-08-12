class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        List<int []>  merged = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int l = intervals[0][1];
        int f = intervals[0][0];

        for(int i = 1; i < intervals.length ; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start > l){
                merged.add(new int[]{f, l});
                f= start;
                l = end;
            }
            else{
                l = Math.max(end, l);
            }
        }
        merged.add(new int[]{f, l});
        return merged.toArray(new int[merged.size()][]);
    }
}
