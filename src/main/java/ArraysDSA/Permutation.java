package ArraysDSA;
/*
given an arr[] size n, the task is to print the lexicographically next greater permutation of the given array. if there
does not exist any greater permutation, then find the lexicographically smallest permutation of the given array
 */
public class Permutation {
    static void nextPermutation(int[] arr){
        int n = arr.length;

        //find the pivot point
        int pivot = -1;
        for (int i = n - 2; i>=0; i--){
          if(arr[i]  < arr[i+1]){
              pivot = i;
              break;
          }
        }

        //if pivot point doesn't exist, reverse the whole array
        if(pivot == -1){
            swap(arr,0,n-1);
            return;
        }

        //find the element from the right that is greater than pivot

        for(int i = n -1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }

        //reverse the element from pivot to end
        reverse(arr,pivot + 1,n-1);
    }
    //helper method to reverse array
    private static void reverse(int[] arr,int start, int end){
        while(start < end){
            swap(arr, start++,end--);
        }
    }

    //helper method to swap array element
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0};
        nextPermutation(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
