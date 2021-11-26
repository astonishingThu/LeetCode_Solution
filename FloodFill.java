public class FloodFill {
    public static void main(String[] args) {  
        int[][] image = {{2,1,1},{1,1,2},{2,2,1}};
        int[][] result = floodFill(image, 1, 1, 2);
        for (int row = 0; row<image.length; row++) {
            for (int col = 0; col<image[0].length; col++) {
                System.out.print(image[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int startRow, int startCol, int newColor) {  // using DFS
        if (image[startRow][startCol]==newColor) return image; // if the start cell color is the same as the new color then return image

        fill(image, startRow, startCol, image[startRow][startCol], newColor); //create a fill() method 
        return image;
    }

    public static void fill(int[][] image, int row, int col, int originalColor, int newColor) { // originalColor is the color of the start cell
        if (row>=0 && row<image.length && col>=0 && col<image[0].length && image[row][col]==originalColor) { // check is the current cell
            // out of bound and is it currentColor(originalColor) is the same as the startCell if that case then change the color to the new color
            image[row][col] = newColor; 
            fill(image, row-1, col, originalColor, newColor); // check 4 directions of the current cell
            fill(image, row+1, col, originalColor, newColor);
            fill(image, row, col-1, originalColor, newColor);
            fill(image, row, col+1, originalColor, newColor);
        }
    }
}
