import java.util.*;
public class FibonocciNumber {
    public static void main(String[] args) {
        HashMap<Long, Long> map = new HashMap<>();
        long n = 100;
        
        System.out.println(fibo(n));
    }

    public static long fib(long n) { // Recursion approach Time Complexity: O(2^n)
        if (n==0) return 0;
        if (n==1) return 1;

        return fib(n-1)+fib(n-2);
    }

    public static long fib (long n, HashMap<Long, Long> map) { // Using HashMap to store the already calculated numbers;
        // Remember create the hash map out side this method // Time Complexity: O(n)
        if (n==0) return 0;  // Dynamic Programming using Top-down approach (Memoization + Recursion)
        if (n==1) return 1;
        if (map.containsKey(n)) return map.get(n);
        map.put(n, fib(n-1, map)+fib(n-2, map));
        return map.get(n);
    }
    
    public static long f(long n) { // Dynamic Programming using bottom-up approach (tabulation) 
        //Space Complexity O(n) // Time Complexity: O(n)
        if (n==0) return 0;
        if (n==1) return 1;
        long[] arr = new long[(int) (n+2)];
        arr[0] = 0;
        arr[1] = 1;
        for (int i =2; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[(int) n];
    }

    public static long fibo (long n) { // Space Complexity O(1) Time Complexity: O(n)
        if (n==0) return 0;
        if (n==1) return 1;
        long a = 0;
        long b = 1;
        long c = 0;
        
        for (int i = 2; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
} 