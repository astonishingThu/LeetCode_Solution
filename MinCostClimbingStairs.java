public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) { // Bottom Up Approach 
        // Recurrence Relation : minCost[n] = cost[n] + Math.min(minCost[n-1],minCost[n-2])
        // We can reach the top either moving from n-1 point or n-2 because we can take 1 or 2 steps at a time
        // So we just need to compare the cost between these two point plus the cost at the current point which is cost[n] 
        // The reason why we have to plus the current point is we are standing at this point so we have to plus that amount of cost
        // When we finish determining the recurrence relation and base cases, it should be easy to utilize bottom up approach
        int n = cost.length;
        if (n==1) return cost[0];
        if (n==2) return Math.min(cost[0], cost[1]);
        int[] minCost = new int[n+1];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for (int i=2; i<n; i++) { // we just have to go to the n-1 point here because the last step is not affect to our result
                                // It's kind of similar to the climbing stairs problem
            minCost[i] = cost[i]+ Math.min(minCost[i-1],minCost[i-2]);
        }
        return Math.min(minCost[n-1], minCost[n-2]);
    }
}
