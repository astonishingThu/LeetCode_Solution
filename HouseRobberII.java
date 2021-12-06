public class HouseRobberII {
    public static void main(String[] args) {
        int[] houses = {2,3,2};
        System.out.println(rob(houses));
    }

    public static int rob(int[] houses) { // There are 2 options: 1. take the first house so we don't take the last house
    // 2. not take the first house so we can take the last one
    // Compare those 2 options to find the max
        if (houses.length==1) return houses[0];
        return Math.max(maxVal(houses,1,houses.length-1), maxVal(houses,0,houses.length-2));
    }

    public static int maxVal(int[] houses, int start, int end) {
        int i_1 = 0;
        int i_2 = 0;

        for (int i=start; i<=end; i++) {
            int currVal = Math.max(i_1, i_2+houses[i]);
            int temp = i_1;
            i_1 = currVal;
            i_2 = temp;
        }
        return i_1;
    }
}
