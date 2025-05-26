package ArraysDSA;

/*
Given an array consisting of n integers the tasks is to find the array elements which occurs more than floor (n/3).
 */

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    //solving using boyer-moore's voting algorithm
    static List<Integer> FindMajority(int[] arr){
        int n = arr.length;

        //initializing two candidates and their counts
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;

        for (int ele : arr) {
            //increment count for candidate1
            if(ele1 == ele){
                cnt1++;
            }
            //increment count for candidate2
            else if (ele2 == ele){
                cnt2++;
            }
            //new candidate if count is zero
            else if (cnt1 == 0){
                ele1 = ele;
                cnt1++;
            }
            //new candidate 2 if count is zero
            else if (cnt2 == 0){
                ele2 = ele;
                cnt2++;
            }
            //decrease counts it neither candidate
            else {
                cnt1--; cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();

        cnt1 = 0;
        cnt2 = 0;

        //count the occurrences of candidate
        for (int ele : arr ){
            if (ele1 == ele) cnt1++;
            if(ele2 == ele) cnt2++;
        }
        //add to result if they are majority element
        if (cnt1 > n/3) res.add(ele1);
        if((cnt2 > n/3) && ele1 != ele2) res.add(ele2);

        if (res.size() == 2&& res.get(0) > res.get(1)){
          int temp = res.get(0);
          res.set(0,res.get(1));
          res.set(1,temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1,3,2,1,1,};
        List <Integer> res = FindMajority(arr);
        for(int ele : res){
            System.out.print(ele+" ");

        }
    }
}
