package ng.ds;
import java.util.*;


public class AITest {


    public static  int sumClosestToZero(int[] nums) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return closestSum;
    }

    public static void main(String arg[]){

        int arr[] = {4,1,2,4,5};

        System.out.println(sumClosestToZero(arr));
    }

}
