import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) { // the idea is we use the preRow to update the current row
        List<List<Integer>> list = new ArrayList<>();

        List<Integer>preRow = new ArrayList<>();  // use preRow to store the current row

        for (int i = 1; i<=numRows; i++) {  // start at index 1, it won't work if we start at 0
            List<Integer> currRow = new ArrayList<>();
            for (int j = 1; j<=i; j++) { // 
                if (j==1 || j==i) currRow.add(1);  // if they are the first and last node of a row, they always will be 1
                else currRow.add(preRow.get(j-1)+preRow.get(j-2)); // we update the current row base on the previous row 
            }
            list.add(currRow); // add the current row to the list whenever the inner loop is finised, then we update the previous row
            preRow = currRow; 
        }
        return list;
    }
}