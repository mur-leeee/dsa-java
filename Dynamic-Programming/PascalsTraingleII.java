class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i <= rowIndex ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else{
                    int left = res.get(i-1).get(j-1);
                    int right = res.get(i-1).get(j);
                    temp.add(left + right);
                }
            }
            res.add(temp);
        }
        return res.get(rowIndex);
    }
}
