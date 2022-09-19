public class LCReplaceElementswithGreatestElementonRightSide {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int a = -1;
            for(int i = arr.length-1; i>=0 ; i--){
                int b = arr[i];
                arr[i] = a;
                a = Math.max(a,b);
            }
            return arr;
        }
    }
}
