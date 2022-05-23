import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(Solution.threeSum(nums));

    }
}
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Idea: Loop over the array, group one element with a pair of twoSum -> Using the twoSum problem's approach
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if (n<3) return list;
        for (int i=0; i<n; i++) { // loop over the array
            if (i>0 && nums[i] == nums[i-1]) continue;  // avoid dupplicates 
            int left = i+1;
            int right = n-1;
            while (left<right) { // Check all of the possibilities of one element ( different twoSum pairs)
                int sum = nums[left]+nums[right]+nums[i];
                if (sum==0) {
                    ArrayList<Integer> arrList = new ArrayList<>();
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    right--;
                    while (nums[right]==nums[right+1] && left<right) right--;  // Decrement the right pointer and check for dupplicates
                } else if (sum>0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return list;
    }
}
