//Ameer Ahmed

import java.util.Arrays;

public class Solution {
    public static int [] getConcatenation(int[] nums) {

        //ans is our holder, the problem wanted us to make it 2 times as large as the nums array
        int [] ans = new int[2 * nums.length];
        for(int k = 0; k < ans.length; k++) {
            System.out.println(ans[k]);
        }

        for(int i = 0; i < nums.length; i++) {
            //we want to copy the numbers from the nums array and then put it into the ans array
            nums[i] = ans[i];
        }

        int[] arr2 = {4,5,6};
        for(int j = 0; j < arr2.length; j++) {
        }

        return ans;
    }
    public static void main (String[] args) {
        int[] nums = {1,2,3};
        System.out.println("Array: " + Arrays.toString(nums));

    }
}