package ArraysDSA;

/*
Given an array arr, return the second-largest distant element from an array. If the second-largest element
doesn't exist return -1;
input arr[] = {12,35,1,10,34,1}
output : 34
 */

import java.util.Arrays;

public class SecondLargestArray {
    //function to find the 2nd largest element
    static int getSecondLargest(int[] arr){
       //sort the array in non-decreasing order
       int n = arr.length;

        Arrays.sort(arr);

        //start form second last element as first element is largest
        for (int i = n - 2; i >= 0 ; i++) {

            //return the first element which is not equal to the largest element

            if (arr[i] != arr[n-1]) {
                return arr[i];
            }

        }
        //if no second-largest element was found return -1;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
}
