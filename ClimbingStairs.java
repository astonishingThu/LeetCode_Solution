public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) { // It's basically the same as Fibonacci Numbers (using bottom up approach)
        if (n==1) return 1;
        if (n==2) return 2;

        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2]; // This is the fomular. Just have to remember it
        }
        return arr[n];
    }
}
