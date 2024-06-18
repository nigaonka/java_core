/**
 * Sort the array
 *  Asceding order for even numbers
 *  Descending of odd numbers
 */

package ng.ds;

import java.util.*;



public class TwoWaySort {

    public static void sortArray(int[] arr)
    {
        List evenList = new ArrayList<Integer>();
        List oddList = new ArrayList<Integer>();

        for (int i=0;i< arr.length;i++)
        {
            if(arr[i] % 2 == 0)
                evenList.add(arr[i]);
            else
                oddList.add(arr[i]);
        }
        printArra(evenList);
        System.out.println("Odd List ");
        printArra(oddList);

        System.out.println("Sorted ");
        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());
        printArra(evenList);
        System.out.println("Odd List ");
        printArra(oddList);


        
    }

    public static void printArra(List list){

        list.forEach(System.out::println);

        }

        public static void main (String arg[])
        {
            int [] arr = {2,4,1,6,7,3};
            sortArray(arr);
        }
    
}
