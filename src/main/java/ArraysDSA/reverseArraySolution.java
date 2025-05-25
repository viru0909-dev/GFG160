package ArraysDSA;

/*
You are given an array of integer arr.
Your task is to reverse the given array and return array.
 */

public class reverseArraySolution {
    static void reverseArray(int[] arr) {
       //initializing left to the beginning and right to the end.
        int left = 0, right = arr.length - 1;

        //iterate till left is less than right

        while(left < right) {
            //swap the element at left and right position.

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            //increment of the left pointer
            left++;

            //decrement of the right pointer
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,5};

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
