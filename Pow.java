public class Pow {
    public static void main(String[] args) {
        int n = 5;
        int x = 3;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n==0) return 1;  // base case

        double result = myPow(x, n/2); // The idea is we divive n by 2 each time to reduce the amout of time doing the same thing

        //Ex: 2^5 = 2^2 * 2^2 * 2;        2^4 = 2^2 * 2^2;      2^-3 = 1/(2^3) = 1/(2^2) * 1/2;
        
        // This line is quite tricky to understand but it works. At this point I just remember it 
        return n%2==0? result*result: n>0? result*result*x: result*result*(1/x); 
        
    }

}
