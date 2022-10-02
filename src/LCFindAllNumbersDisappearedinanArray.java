import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LCFindAllNumbersDisappearedinanArray {

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
       for(int i = 0;  i < nums.length; i++){
           int a = Math.abs(nums[i]);
           nums[a-1] = -Math.abs(nums[a-1]);
       }
       List<Integer> ans = new ArrayList<>();
       for(int i = 0 ;i < nums.length; i++){
           if(nums[i] > 0){
               ans.add(i+1);
           }
       }
       return ans;
        }
    }
}
