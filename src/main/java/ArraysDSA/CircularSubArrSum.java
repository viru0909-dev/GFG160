package ArraysDSA;
/*
Maximum Circular Sub-array sum
Given a circular array arr[] of size n, find the maximum possible sum of a non-empty subArray
input arr[] = {8,-8,9,-9,10,-11,12}
output : 22
 */
public class CircularSubArrSum {
    static int circularSubArraySum (int[] arr) {
        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            //Kadane's to find maximum sum sub-array

            currMaxSum = Math.max(currMaxSum + arr[i],arr[i]);
            maxSum = Math.max(maxSum,currMaxSum);

            //Kadane's to find minimum sum sub-array
            currMinSum = Math.min(currMinSum + arr[i],arr[i]);
            minSum = Math.min(currMinSum,minSum);

            //sum of all the element of input arr
            totalSum += arr[i];
        }
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        if( minSum == totalSum)
            return normalSum;

        return Math.max(normalSum,circularSum);
    }

    public static void main(String[] args) {
      int[] arr =  {8,-8,9,-9,10,-11,12};
        System.out.println(circularSubArraySum(arr));
    }

}
