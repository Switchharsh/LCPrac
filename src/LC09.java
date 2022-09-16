public class LC09 {
    class Solution {
        public boolean isPalindrome(int x) {
         if (x < 0){
             return false;
         }
         int reversed = 0, remainder, input = x;
         while (input != 0) {
             remainder = input % 10;
             reversed = reversed * 10 + remainder;
             input /= 10;
         }

         return reversed == x;

        }
    }
}
