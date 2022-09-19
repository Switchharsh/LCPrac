public class LCValidMountainArray {
    class Solution {
        public boolean validMountainArray(int[] arr) {
            boolean a = false;
            if(arr.length < 3){
                return false;
            }
            for( int i = 1; i < arr.length-1; i++){
                if(arr[i] <= arr[i-1] && a == false){
                    return false;
                }
                if(arr[i] > arr[i+1] && arr[i] > arr[i-1] && a==false){
                    a = true;

                }
                if(arr[i] <= arr[i+1] && a == true){
                    return false;
                }


            }
            return a;
        }
    }
}
