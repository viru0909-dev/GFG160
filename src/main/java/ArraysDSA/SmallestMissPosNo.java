package ArraysDSA;

/*
find the smallest missing positive no.
input arr[]={2,-3,4,1,1,7}
output = 3
 */

public class SmallestMissPosNo {
    static int missingNumber(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            /*
            if arr[i] is within the range [1,n] & arr[i] is not placed
            at arr(arr[i]-1)th index in arr
             */
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp - 1] = temp;
            }
        }
        /*
        If any number is not at its corresponding index
        then it is the missing number
         */
        for (int i = 1; i < n; i++) {
            if (i != arr[i-1])
                return i;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {2,-3,4,1,1,7};
        System.out.println(missingNumber(arr));
    }
}
