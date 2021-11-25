import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.swing.text.AbstractDocument.LeafElement;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(rottingOranges(grid));
    }

    public static int rottingOranges(int[][] grid) {
        int minute = 0; int fresh = 0; int total = 0;
        Queue<int[]> rottenPos = new LinkedList<>();  // Queue is stored the position of rotten oranges
        for (int row = 0 ; row<grid.length; row++) {
            for (int col = 0; col<grid.length; col++) {
                if (grid[row][col]!=0) total++;
                if (grid[row][col]==1) fresh++;
                if (grid[row][col]==2) rottenPos.offer(new int[] {row,col});
            }
        }

        if (total==0 || fresh==0) return 0;

        while (!rottenPos.isEmpty()) {   // loop through the queue;
            int size = rottenPos.size();  
            for (int i = 0; i<size; i++) {
                int[] temp = rottenPos.poll();  // take the first element of the queue and start to check 4 directions of it
                if (temp[0]>0 && grid[temp[0]-1][temp[1]]==1) {  // check for the bound and if the current one is fresh then make it rotten
                    // and add its position in the queue
                    fresh--;
                    grid[temp[0]-1][temp[1]]=2;
                    rottenPos.offer(new int[] {temp[0]-1,temp[1]});
                }
                if (temp[0]<grid.length-1 && grid[temp[0]+1][temp[1]]==1) {
                    fresh--;
                    grid[temp[0]+1][temp[1]]=2;
                    rottenPos.offer(new int[] {temp[0]+1,temp[1]});
                }
                if (temp[1]>0 && grid[temp[0]][temp[1]-1]==1) {
                    fresh--;
                    grid[temp[0]][temp[1]-1]=2;
                    rottenPos.offer(new int[] {temp[0],temp[1]-1});
                }
                if (temp[1]<grid[0].length-1 && grid[temp[0]][temp[1]+1]==1) {
                    fresh--;
                    grid[temp[0]][temp[1]+1]=2;
                    rottenPos.offer(new int[] {temp[0],temp[1]+1});
                }
            }
            minute++; // when we done a round, increment minute by one
        }
        return fresh==0? minute-1:-1; // we want to return the minute -1 if there are no fresh orange left otherwise return -1
    }
}
