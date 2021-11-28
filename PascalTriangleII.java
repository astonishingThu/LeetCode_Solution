import java.util.*;

public class PascalTriangleII {
    public static void main(String[] args) {
        int rowIndex = 1;
        System.out.println(getRow(rowIndex));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);  // generate the first row which always has 1 element and that is 1
        for (int i=1; i<=rowIndex; i++) {  // the number of elements in a row equal to the index of that row 
                                            // Ex : In row 5th, there are 5 elements
            for (int j=i-1; j>0; j--) {    // the first and the last element of a row are always equal to 1
                                            // Each row, iterate j from the last element which is i-1 downto the second element
                                            // Because the first element is always 1            
                int temp = list.get(j) + list.get(j-1); // update the element at index j which is equal to the sum of two element at j and (j-1)
                list.set(j, temp);
            }
            list.add(1); // at the end of each row we want to add 1 because the last element is always 1
        }
        return list;
    }
}