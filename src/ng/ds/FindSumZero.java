package ng.ds;

import java.util.Arrays;

public class FindSumZero {

    public static void findZeroSum()
    {
        int[] arr = { 4, -5, 3, -2, 10, -6, 20};
        Arrays.sort(arr);
        int i =0;
        int j= arr.length-1;
        int positveClose = Integer.MAX_VALUE;
        int negetiveClose = Integer.MIN_VALUE;

        while (i<j){
            int temp = arr[i]+ arr[j];
            if (temp > 0) {
                if (positveClose > temp) {
                    negetiveClose = temp;
                }
                j--;
            }else if(temp<0){
                if(negetiveClose < temp){
                    positveClose = temp;
                }
                i++;
            }else {
                return;
            }


        }
        System.out.println( Math.abs(positveClose)<Math.abs(negetiveClose)?positveClose:negetiveClose);
    }

    public static void main(String arg[]){
        findZeroSum();
    }
}
