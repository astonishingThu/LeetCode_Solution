import javax.naming.spi.ResolveResult;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        rotateArray(arr, 2);
        for (int i=0; i<4; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        k %= arr.length; // make sure the k is not bigger than the length of the array
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}