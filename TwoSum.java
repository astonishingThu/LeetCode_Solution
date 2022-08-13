import java.util.HashMap;

// https://leetcode.com/problems/two-sum/submissions/

public class TwoSum {
  
    public static void main(String[] args) {
        int[] nums = {4,1,8,2};
        int target = 10;
        int[] res = twoSum(nums,target);
        for (int num:res) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            } 
            map.put(nums[i],i);
        }
        return res;
    }
}
