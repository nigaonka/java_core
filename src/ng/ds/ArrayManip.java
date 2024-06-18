package ng.ds;

import java.util.Arrays;

public class ArrayManip {

    public static int getElement(int[] arr, int n, int s) {

        Arrays.sort(arr);
        int sum = 0;
        for (Integer i = 0; i < n; i++) {

            if (sum + (arr[i] * (n - i)) == s)
                return arr[i];
            sum += arr[i];

        }
        return -1;


    }

    public static void main(String[] args) {
        int S = 5;
        int[] a = {1, 3, 2, 5, 8};
        int n = a.length;

        System.out.println(getElement(a, n, S));
    }
}
