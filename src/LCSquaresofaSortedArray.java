public class LCSquaresofaSortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
        int a = nums.length;
            int [] b = new int[a];
        int c = 0, d = a-1, e = a-1;
        while (c <= e ){
            if(nums[c]*nums[c] > nums[e] * nums[e]){
                b[d] = nums[c]*nums[c];
                c++;
            }
            else{
                b[d] = nums[e]*nums[e];
                e--;
            }
            d --;
           }

b[0] = nums[c]*nums[c];
        return b;
        }

    }
}
