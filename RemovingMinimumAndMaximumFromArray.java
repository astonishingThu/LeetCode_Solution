public class RemovingMinimumAndMaximumFromArray {
    public static void main(String[] args) {
        int[] arr = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletion(arr));
    }

    public static int minimumDeletion(int[] arr) {
        int min = 0;
        int max = 0;
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            if (arr[min]<arr[i]) min = i;
            if (arr[max]>arr[i]) max = i;
        }
        return Integer.min(Integer.min(Integer.max(min+1,max+1), Integer.max(n-max, n-min)), Integer.min(min+1+n-max, max+1+n-min));
    }
}