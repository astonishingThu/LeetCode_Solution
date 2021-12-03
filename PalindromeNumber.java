public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 123421;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) { // Using 2 pointers // There is another way to do this
                                                // revert the second half of the number and compare it to the first half
        String s = Integer.toString(x);
        int start = 0;
        int end = s.length()-1;
        while (start<end) {
            if (s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
