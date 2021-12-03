public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {2,0,4,2,-4};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {   // Dynamic Programming 
        int min = nums[0];   // keep track of both min and max product 
                            // Why we have to keep track of min?
                            // Think about it like this:
                            // min represents for a negative number, max represents for a positive number
                            // neg*neg = pos, pos*neg = neg
                            // This approach is similar to kadane method, take a look at the maximum subarray for reference 
        int max = nums[0];
        int result = Integer.MIN_VALUE;

        for (int i =1; i<nums.length; i++) {
            int temp = max;

            max = Integer.max(Integer.max(max*nums[i], min*nums[i]), nums[i]);
            min = Integer.min(Integer.min(min*nums[i], temp*nums[i]), nums[i]);

            result = Integer.max(result, max);
        }
        return result;
    }
}