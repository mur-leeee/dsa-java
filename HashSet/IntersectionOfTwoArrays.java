import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for( int num : nums1){
            set.add(num);
        }
        for(int num2 : nums2){
            if(set.contains(num2)){
                result.add(num2);
            }
        }
        int[] output = new int[result.size()];
        int i = 0;
        for(int num : result){
            output[i++] = num;
        }
        return output;
    }
}
