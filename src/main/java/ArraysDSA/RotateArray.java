package ArraysDSA;

/*
given an array of integers arr[] of size n. the task is to rotate the array elements to the left by all position.
 */

public class RotateArray {
    static void rotateArr (int[] arr, int d){

        int n = arr.length;

        //handle the case where d>size of array
        d %= n;

        //reverse the remaining n-d element.
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }
    static void reverse (int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;

        rotateArr(arr,d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
