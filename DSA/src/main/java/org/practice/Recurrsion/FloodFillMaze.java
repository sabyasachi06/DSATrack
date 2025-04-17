package org.practice.Recurrsion;

public class FloodFillMaze {

    public static void findPath(int[][] maze, int row, int col, String psf, boolean[][] marked) {

        if (row<0 || col<0  || row >= maze.length || col >= maze[0].length || marked[row][col] || maze[row][col] == 1) {   // 1
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1){                                                                   // 2
            System.out.println(psf);
            return;
        }
        marked[row][col] = true;                                                                                           // 3
        findPath(maze, row - 1, col,  psf+"T", marked); // moved top                                            // 4
        findPath(maze, row, col - 1,  psf+"L", marked); // moved left                                              // 5
        findPath(maze, row + 1, col,  psf+"D", marked); // moved down                                           // 6
        findPath(maze, row, col + 1,  psf+"R", marked); // moved right                                           // 7
        marked[row][col] = false;                                                                                         // 8
    }
}
