import java.util.HashMap;

public class TwoSum {
    // 1,2,3,5  target = 7
    public static void main(String[] args) {
        int[] nums = {4,1,8,2};
        int target = 10;
        int[] res = twoSum(nums,target);
        for (int num:res) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
            } else {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
