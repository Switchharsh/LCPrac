public class LCRemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
           int finalLength = 0;
           for (int i =0; i < nums.length; i++){
               if(nums[i] != val){
                   nums[finalLength] = nums[i];
                   finalLength++;
               }
           }
           return finalLength;
        }
    }
}
