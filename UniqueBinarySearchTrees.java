public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(n));
    }

    public static int numTrees(int n) {  // This is my favourite problem so far 
                                        // The idea here is create a formula for this particular problem
                                        // It's not easy to understand at first so I think you should watch this video for the best understading
                                        // https://www.youtube.com/watch?v=GgP75HAvrlY
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                G[i]+=G[j-1]*G[i-j];
            }
        }
        return G[n];
    }
}
