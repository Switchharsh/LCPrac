import java.util.HashMap;
import java.util.Map;

public class LC01 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] b = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])){
                    b[1] = i;
                    b[0] = map.get(nums[i]);
                }
                else {
                    map.put(target - nums[i], i);
                }

            }

                return b;
            }

    }
}
