public class LCFindNumberswithEvenNumberofDigits {
    class Solution {
        public int findNumbers(int[] nums) {
            int a = 0, c = 1;
            for (int i = 0; i < nums.length; i++) {
                int b = nums[i];

                while (b > 0) {
                    b = b/10;
                    c++;
                }
                if (c>= 2 && c % 2 == 0) {
                    a++;
                    c = 0;
                }
            }
            return a;
        }
    }
}