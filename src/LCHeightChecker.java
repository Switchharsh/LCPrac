import java.util.Arrays;

public class LCHeightChecker {
    class Solution {
        public int heightChecker(int[] heights) {
           int[]SortHeights = heights.clone();
            Arrays.sort(SortHeights);
            int a = 0;
            for(int i = 0; i<heights.length; i++){
                if(heights[i] != SortHeights[i]) {
                    a++;
                }

            }
            return a;

        }
    }
}
