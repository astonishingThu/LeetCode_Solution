import java.util.Arrays;
import java.util.*;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(arr, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<nums.length; i++) {
            if (nums[i]==target) {
                int j = i;
                while (nums[j]==target) {
                    list.add(j);
                    if (j==nums.length-1) return list;
                    j++;
                }
                return list;
            }
        }
        return list;
    }
}