public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) { // Recursion Approach 
        if (s.length()==0) return s; // Base Case

        return s.substring(1) + s.charAt(0); // Return subString begin at index 1 and the first character 
    }

    public static String reverseString2(String s) { // iterative Approach, same as reverse an array
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while (start<end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
}
