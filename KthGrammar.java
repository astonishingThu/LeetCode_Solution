public class KthGrammar {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        System.out.println(kthGrammar(n, k));
    }

    public static int kthGrammar(int n, int k) {   // Draw a binary tree
        /*       0
              /     \
             0       1
            / \     /  \
           0   1   1    0
          / \ / \ / \  / \
         0  1 1  01 0  0  1
        */

        if (n==1) return 0; // base case

        if (k%2==0) {  // if k is even then k is opposit of its parent and otherwise
                        // Just look at the tree and you gonna understand everything
            if (kthGrammar(n-1, k/2)==0) return 1;   
            else return 0;
        } else {
            if (kthGrammar(n-1,(k+1)/2)==0) return 0;
            else return 1;
        }
    }
}
