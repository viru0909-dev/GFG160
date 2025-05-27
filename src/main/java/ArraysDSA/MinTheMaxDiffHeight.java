package ArraysDSA;

import java.util.Arrays;

/*
minimize the maximum difference between the heights.
java program to min the max difference between heights using sorting
 */

public class MinTheMaxDiffHeight {
    //function to minimize the maximum difference
    static int getMinDiff(int[] arr, int k){
        int n  = arr.length;
        Arrays.sort(arr);
        /*
        If we increase all heights by k or decrease all heights by k, the result will be arr[n-1] - arr[0]
         */
        int res = arr[n-1] - arr[0];
        /*
        impossible to decrement height of ith tower by k, continue
        to the next tower
         */
        for (int i = 1; i < arr.length ; i++) {

            //impossible to decrement height of ith tower by k, continue to next tower
            if(arr[i]-k<0)
                continue;

            //minimum the height after modification
            int minH = Math.min(arr[0] + k, arr[i] - k);
            //maximum the height after modification
            int maxH = Math.max(arr[i - 1]+k,arr[n - 1]-k);

            //store the minimum diff as result
            res = Math.min(res, maxH - minH);
        }
        return res;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] arr = {12, 6, 4, 15, 17, 10};
        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}
