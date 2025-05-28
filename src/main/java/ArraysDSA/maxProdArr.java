package ArraysDSA;

/*
Maximum Product Sub-Array
Given an integer array the task is to find max product of any sub-array
input arr[] = {-2,6,-3,-10,0,2}
output = 180
 */
public class maxProdArr {
    //function to find maximum sub-array
    static long maxProd(int[] arr){
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;

        //leftToRight to store element from left to right
        int leftToRight = 1;

        //RightToLeft to store element from right to left
        int rightToLeft = 1;


        for (int i = 0; i < n; i++) {
            if (leftToRight == 0)
                leftToRight = 1;
            if (rightToLeft == 0)
                rightToLeft = 1;

            //calculating product from index left to right

            leftToRight *= arr[i];

            //calculating product from index right to left

            int j = n-i-1;

            rightToLeft *= arr[j];

            maxProd = Math.max(leftToRight, Math.max(rightToLeft, maxProd));

        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {-2,6,-3,-10,0,2};
        System.out.println(maxProd(arr));
    }
}
