public class LCMoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int zeros = 0;
            for( int i = 0; i< nums.length; i++){
                if(nums[i] != 0){
                    nums[zeros] = nums[i];
                    zeros++;
                }
            }
            for (int i = nums.length-1; i >= zeros; i--){
                nums[i] = 0;
            }
        }
    }
}
