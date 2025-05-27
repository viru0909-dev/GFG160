package ArraysDSA;

/*
given an arr the task is to find the subArray that has the maximum sum and return it's sum
 */

public class MaxSubArr {
    /*
    function to find the maximum subArray sum
     */
    static int maxSubArray(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            /*
            find the maximum sum ending at index i by either extending the maximum sum sub-array ending at index
            i-1 or by starting a new sub-array from index i.
             */

            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            /*
            update res if maximum sub-array sum ending at index i > res
             */

            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArray(arr));
    }
}
