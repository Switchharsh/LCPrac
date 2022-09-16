public class LCFindNumberswithEvenNumberofDigits {
    class Solution {
        public int findNumbers(int[] nums) {
            int c=0;
            String s="";
            for(int i=0;i<nums.length;i++)
            {
                s = Integer.toString(nums[i]);
                if((s.length())%2==0)
                    c++;
            }
            return(c);
        }
    }
}