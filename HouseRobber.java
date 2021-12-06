public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = {1,2,3,1};
        System.out.println(rob(houses));
    }

    public static int rob(int[] houses) { // Identify recurrence relation in this problem 
        // There are 2 option:
        // a. Rob the current house so you can get all of the value from i-2 back to the beginning that you previously took
        // b. Don't rob the current house so you take the i-1 value 
        // That comes to the recurrence relation: money[i] = Math.max(money[i],money[i-1]+currentVal);
        int n = houses.length;
        if (n==1) return houses[0];
        int[] money = new int[n+1];
        money[0] = houses[0];
        money[1] = Math.max(houses[0],houses[1]);
        for (int i=2; i<n; i++) {
            money[i] = Math.max(money[i-1], money[i-2]+houses[i]);
        }
        return money[n-1];
    }
}
 