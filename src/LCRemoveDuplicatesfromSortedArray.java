public class LCRemoveDuplicatesfromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
        int finalLength = 0;
        if(nums.length < 2){
            return nums.length;
        }
        nums[finalLength] = nums[0];
        finalLength++;
        for (int i = 1; i < nums.length; i++){
            if(nums[i]!= nums[i-1]){
                nums[finalLength] = nums[i];
                finalLength++;
            }
        }
        return finalLength;
        }
        }

}
