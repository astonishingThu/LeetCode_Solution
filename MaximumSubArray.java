public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; // [4,-1,2,1] has the largest sum which is 6
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) { // Kadane algorithm
        int currSum = arr[0];
        int maxSum = currSum;

        for (int i=1; i<arr.length; i++) {
            currSum = Math.max(currSum+arr[i],arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
