package ArraysDSA;
/*
Given an array of integers arr[], the tasks is to move all the zeros to the end of the array while maintain the
relative order of all non-zero elements.
 */
public class ZeroArray {
    //function which pushes all zeros to end of arr

    static void pushZerosToEnd(int[] arr){
        //pointer to track the position for next non-zero element

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //if current element is non-zero.
            if(arr[i] != 0) {
                //swap the current element with the 0 at index 'count'

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                //move the count pointer to next position

                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};

        pushZerosToEnd(arr);

        for(int num : arr){
            System.out.print(num + " || ");
        }
    }
}
